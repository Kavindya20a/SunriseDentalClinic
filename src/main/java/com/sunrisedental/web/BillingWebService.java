package com.sunrisedental.web;

import com.sunrisedental.dao.AppointmentDAO;
import com.sunrisedental.dao.TreatmentPriceDAO;
import com.sunrisedental.model.Appointment;
import com.sunrisedental.service.BillCalculator;
import com.sunrisedental.service.BillCalculatorFactory;
import com.sunrisedental.web.dto.BillDTO;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(
        serviceName = "BillingWebService",
        targetNamespace = "http://service.sunrisedental.com/"
)
public class BillingWebService {

    @WebMethod
    public BillDTO calculateBill(int appointmentId) {

        try {

            // Validate appointment ID
            if (appointmentId <= 0) {
                return null;
            }

            // Find appointment
            AppointmentDAO appointmentDAO = new AppointmentDAO();

            Appointment appointment =
                    appointmentDAO.findById(appointmentId);

            if (appointment == null) {
                return null;
            }

            // Get treatment price
            TreatmentPriceDAO priceDAO =
                    new TreatmentPriceDAO();

            double treatmentCost =
                    priceDAO.findPriceByTreatment(
                            appointment.getTreatmentType()
                    );

            if (treatmentCost < 0) {
                return null;
            }

            // Calculate total
            BillCalculator calculator =
                    BillCalculatorFactory.create();

            double total =
                    calculator.total(treatmentCost);

            // Create bill DTO
            BillDTO bill = new BillDTO();

            bill.appointmentId =
                    appointment.getAppointmentId();

            bill.patientName =
                    appointment.getPatientName();

            bill.dentistName =
                    appointment.getDentistName();

            bill.treatmentType =
                    appointment.getTreatmentType();

            bill.treatmentCost =
                    treatmentCost;

            bill.total =
                    total;

            return bill;

        } catch (Exception e) {

            e.printStackTrace();

            return null;
        }
    }
}