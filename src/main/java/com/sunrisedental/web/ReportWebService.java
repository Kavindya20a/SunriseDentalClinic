package com.sunrisedental.web;
import com.sunrisedental.dao.AppointmentDAO;
import com.sunrisedental.web.dto.AppointmentDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;
import com.sunrisedental.model.Appointment;

@WebService(serviceName="ReportWebService", targetNamespace="http://service.sunrisedental.com/")
public class ReportWebService {
    @WebMethod
    public AppointmentDTO[] getAppointments(){
        try{
            List<Appointment> list=new AppointmentDAO().findAll();
            AppointmentDTO[] result=new AppointmentDTO[list.size()];
            for(int i=0;i<list.size();i++) result[i]=AppointmentMapper.toDTO(list.get(i));
            return result;
        }catch(Exception e){return new AppointmentDTO[0];}
    }
}
