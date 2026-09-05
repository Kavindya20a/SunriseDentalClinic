package com.sunrisedental.service;

import java.time.LocalDate;
import java.time.LocalTime;

public final class ValidationService {

    private ValidationService() {
    }

    public static String validateAppointment(
            String patient,
            String address,
            String contact,
            String dentist,
            String treatment,
            LocalDate date,
            LocalTime time) {

        // Patient name validation
        if (blank(patient)) {
            return "All fields are required.";
        }

        // Contact number validation
        if (blank(contact)) {
            return "All fields are required.";
        }

        // Dentist validation
        if (blank(dentist) || dentist.equals("Select Dentist")) {
            return "Please select a dentist.";
        }

        // Treatment validation
        if (blank(treatment) || treatment.equals("Select Treatment")) {
            return "Please select a treatment.";
        }

        // Date validation
        if (date == null) {
            return "Please enter a valid appointment date.";
        }

        // Time validation
        if (time == null) {
            return "Please enter a valid appointment time.";
        }

        // Appointment date cannot be in the past
        if (date.isBefore(LocalDate.now())) {
            return "Appointment date cannot be in the past.";
        }

        // Contact number format validation
        if (!contact.matches("[0-9+ -]{7,15}")) {
            return "Enter a valid contact number.";
        }

        // Everything is valid
        return "";
    }

    private static boolean blank(String value) {
        return value == null || value.trim().isEmpty();
    }
}