package com.sunrisedental;
import com.sunrisedental.web.WebServiceServer;
import com.sunrisedental.ui.Loginframe;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args){
        try{
            WebServiceServer.start();
            System.out.println("Sunrise Dental SOAP Web Services started.");
            System.out.println("Auth:          http://localhost:8081/ws/auth?wsdl");
            System.out.println("Appointments:  http://localhost:8082/ws/appointments?wsdl");
            System.out.println("Search:        http://localhost:8083/ws/search?wsdl");
            System.out.println("Billing:       http://localhost:8084/ws/billing?wsdl");
            System.out.println("Report:        http://localhost:8085/ws/report?wsdl");
            SwingUtilities.invokeLater(()->new Loginframe().setVisible(true));
        }catch(Exception e){
            SwingUtilities.invokeLater(()->JOptionPane.showMessageDialog(null,
                "Could not start web services.\n"+e.getMessage(),"Startup Error",JOptionPane.ERROR_MESSAGE));
        }
    }
}
