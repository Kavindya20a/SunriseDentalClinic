package com.sunrisedental.web;
import jakarta.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

public final class WebServiceServer {
    private static final List<Endpoint> endpoints=new ArrayList<>();
    private WebServiceServer(){}
    public static synchronized void start(){
        if(!endpoints.isEmpty()) return;
        endpoints.add(Endpoint.publish("http://localhost:8081/ws/auth",new AuthWebService()));
        endpoints.add(Endpoint.publish("http://localhost:8082/ws/appointments",new AppointmentWebService()));
        endpoints.add(Endpoint.publish("http://localhost:8083/ws/search",new SearchWebService()));
        endpoints.add(Endpoint.publish("http://localhost:8084/ws/billing",new BillingWebService()));
        endpoints.add(Endpoint.publish("http://localhost:8085/ws/report",new ReportWebService()));
    }
    public static void stop(){
        for(Endpoint e:endpoints)e.stop();
        endpoints.clear();
    }
}
