package com.sunrisedental.client;
import com.sunrisedental.web.dto.AppointmentDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace="http://service.sunrisedental.com/", name="ReportWebService")
public interface ReportPort {
    @WebMethod AppointmentDTO[] getAppointments();
}
