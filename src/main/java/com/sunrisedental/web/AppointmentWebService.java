package com.sunrisedental.web;

import com.sunrisedental.dao.AppointmentDAO;
import com.sunrisedental.model.Appointment;
import com.sunrisedental.service.ValidationService;
import com.sunrisedental.web.dto.ServiceResponse;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.time.LocalTime;

@WebService(
        serviceName = "AppointmentWebService",
        targetNamespace = "http://service.sunrisedental.com/"
)
public class AppointmentWebService {
    @WebMethod
    public ServiceResponse registerAppointment(
            String patient,
            String address,
            String contact,
            String dentist,
            String treatment,
            String date,
            String time) {

        try {

            LocalDate appointmentDate = LocalDate.parse(date);
            LocalTime appointmentTime = LocalTime.parse(time);

      
            String error = ValidationService.validateAppointment(
                    patient,
                    address,
                    contact,
                    dentist,
                    treatment,
                    appointmentDate,
                    appointmentTime
            );

            if (!error.isEmpty()) {
                return new ServiceResponse(false, error, -1);
            }

     
            Appointment appointment = new Appointment(
                    patient.trim(),
                    address.trim(),
                    contact.trim(),
                    dentist.trim(),
                    treatment.trim(),
                    appointmentDate,
                    appointmentTime
            );

            
            AppointmentDAO appointmentDAO = new AppointmentDAO();

            int appointmentId = appointmentDAO.insert(appointment);

            
            return new ServiceResponse(
                    true,
                    "Appointment registered successfully.",
                    appointmentId
            );

        } catch (Exception e) {

            e.printStackTrace();

            return new ServiceResponse(
                    false,
                    "Unable to register appointment: " + e.getMessage(),
                    -1
            );
        }
    }


    @WebMethod
    public String searchAppointment(int appointmentId) {

        try {

            AppointmentDAO appointmentDAO = new AppointmentDAO();

            Appointment appointment =
                    appointmentDAO.findById(appointmentId);

            // If appointment does not exist
            if (appointment == null) {

                return "Appointment not found.";
            }

            // Return all appointment details
            return "Appointment ID: " + appointment.getAppointmentId()
                    + "\nPatient Name: " + appointment.getPatientName()
                    + "\nAddress: " + appointment.getAddress()
                    + "\nContact Number: " + appointment.getContactNumber()
                    + "\nDentist Name: " + appointment.getDentistName()
                    + "\nTreatment Type: " + appointment.getTreatmentType()
                    + "\nAppointment Date: " + appointment.getAppointmentDate()
                    + "\nAppointment Time: " + appointment.getAppointmentTime();

        } catch (Exception e) {

            e.printStackTrace();

            return "Error searching appointment: "
                    + e.getMessage();
        }
    }
}