package com.sunrisedental.client;
import com.sunrisedental.web.dto.ServiceResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace="http://service.sunrisedental.com/", name="AppointmentWebService")
public interface AppointmentPort {
    @WebMethod ServiceResponse registerAppointment(String patient,String address,String contact,String dentist,String treatment,String date,String time);

    public String searchAppointment(int appointmentId);
}
