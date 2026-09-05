package com.sunrisedental.client;

import com.sunrisedental.web.dto.BillDTO;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(
        targetNamespace = "http://service.sunrisedental.com/",
        name = "BillingWebService"
)
public interface BillingPort {

    @WebMethod
    BillDTO calculateBill(int appointmentId);

}