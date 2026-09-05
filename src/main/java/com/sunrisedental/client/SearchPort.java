package com.sunrisedental.client;
import com.sunrisedental.web.dto.AppointmentDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace="http://service.sunrisedental.com/", name="SearchWebService")
public interface SearchPort {
    @WebMethod AppointmentDTO findAppointment(int appointmentId);
}
