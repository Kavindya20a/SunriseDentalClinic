package com.sunrisedental.client;
public final class ServiceClient {
    private ServiceClient(){}
    public static AuthPort auth(){return SoapClient.getPort("http://localhost:8081/ws/auth?wsdl","AuthWebService",AuthPort.class);}
    public static AppointmentPort appointments(){return SoapClient.getPort("http://localhost:8082/ws/appointments?wsdl","AppointmentWebService",AppointmentPort.class);}
    public static SearchPort search(){return SoapClient.getPort("http://localhost:8083/ws/search?wsdl","SearchWebService",SearchPort.class);}
    public static BillingPort billing(){return SoapClient.getPort("http://localhost:8084/ws/billing?wsdl","BillingWebService",BillingPort.class);}
    public static ReportPort report(){return SoapClient.getPort("http://localhost:8085/ws/report?wsdl","ReportWebService",ReportPort.class);}
}
