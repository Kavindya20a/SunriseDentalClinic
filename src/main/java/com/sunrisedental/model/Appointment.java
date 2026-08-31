package com.sunrisedental.model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentId;
    private String patientName;
    private String address;
    private String contactNumber;
    private String dentistName;
    private String treatmentType;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

    public Appointment() {
    }

    public Appointment(String patientName,
                       String address,
                       String contactNumber,
                       String dentistName,
                       String treatmentType,
                       LocalDate appointmentDate,
                       LocalTime appointmentTime) {

        this.patientName = patientName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dentistName = dentistName;
        this.treatmentType = treatmentType;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
