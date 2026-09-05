package com.sunrisedental.web;
import com.sunrisedental.model.Appointment;
import com.sunrisedental.web.dto.AppointmentDTO;

public final class AppointmentMapper {
    private AppointmentMapper(){}
    public static AppointmentDTO toDTO(Appointment a){
        return new AppointmentDTO(a.getAppointmentId(),a.getPatientName(),a.getAddress(),a.getContactNumber(),
            a.getDentistName(),a.getTreatmentType(),a.getAppointmentDate().toString(),a.getAppointmentTime().toString());
    }
}
