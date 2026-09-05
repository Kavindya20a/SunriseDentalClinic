package com.sunrisedental.web.dto;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceResponse {
    public boolean success;
    public String message;
    public int id;
    public ServiceResponse(){}
    public ServiceResponse(boolean success,String message,int id){this.success=success;this.message=message;this.id=id;}
}
