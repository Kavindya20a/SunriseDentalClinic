package com.sunrisedental.client;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public final class SoapClient {
    private SoapClient(){}
    public static <T> T getPort(String wsdl,String serviceName,Class<T> type){
        try{
            QName q=new QName("http://service.sunrisedental.com/",serviceName);
            return Service.create(new URL(wsdl),q).getPort(type);
        }catch(Exception e){throw new RuntimeException("Web service connection failed: "+e.getMessage(),e);}
    }
}
