package com.sunrisedental.web.dto;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AppointmentDTO {
    public int appointmentId;
    public String patientName,address,contactNumber,dentistName,treatmentType,appointmentDate,appointmentTime;
    public AppointmentDTO(){}
    public AppointmentDTO(int id,String patient,String address,String contact,String dentist,String treatment,String date,String time){
        this.appointmentId=id; this.patientName=patient; this.address=address; this.contactNumber=contact;
        this.dentistName=dentist; this.treatmentType=treatment; this.appointmentDate=date; this.appointmentTime=time;
    }
}
