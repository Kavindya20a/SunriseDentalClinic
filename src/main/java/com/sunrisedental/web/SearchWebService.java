package com.sunrisedental.web;
import com.sunrisedental.dao.AppointmentDAO;
import com.sunrisedental.model.Appointment;
import com.sunrisedental.web.dto.AppointmentDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName="SearchWebService", targetNamespace="http://service.sunrisedental.com/")
public class SearchWebService {
    @WebMethod
    public AppointmentDTO findAppointment(int appointmentId){
        try{
            Appointment a=new AppointmentDAO().findById(appointmentId);
            return a==null?null:AppointmentMapper.toDTO(a);
        }catch(Exception e){return null;}
    }
}
