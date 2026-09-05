package com.sunrisedental;
import com.sunrisedental.service.ValidationService;
import org.junit.jupiter.api.Test;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;

class ValidationServiceTest {
    @Test void validAppointment(){
        assertEquals("",ValidationService.validateAppointment("A","Colombo","0771234567","Dr A","Cleaning",
            LocalDate.now().plusDays(1),LocalTime.of(9,0)));
    }
    @Test void missingPatient(){
        assertEquals("All fields are required.",ValidationService.validateAppointment("","Colombo","0771234567","Dr A","Cleaning",
            LocalDate.now().plusDays(1),LocalTime.of(9,0)));
    }
    @Test void pastDate(){
        assertEquals("Appointment date cannot be in the past.",ValidationService.validateAppointment("A","Colombo","0771234567","Dr A","Cleaning",
            LocalDate.now().minusDays(1),LocalTime.of(9,0)));
    }
    @Test void badContact(){
        assertEquals("Enter a valid contact number.",ValidationService.validateAppointment("A","Colombo","abc","Dr A","Cleaning",
            LocalDate.now().plusDays(1),LocalTime.of(9,0)));
    }
}
