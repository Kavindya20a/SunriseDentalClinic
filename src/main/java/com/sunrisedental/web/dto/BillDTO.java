package com.sunrisedental.web.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class BillDTO {

    public int appointmentId;

    public String patientName;

    public String dentistName;

    public String treatmentType;

    public double treatmentCost;

    public double total;

    public BillDTO() {
    }
}