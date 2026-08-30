# Sunrise Dental Clinic — Single NetBeans Maven Project

This version keeps **everything in ONE Java application project**.

It contains:
- Java Swing desktop UI
- MySQL database/DAO layer
- SOAP/JAX-WS web services
- SOAP client layer used by the Swing UI
- Validation and billing business logic
- Unit test
- UML/architecture documentation

## Important architecture

The Swing UI does **not** call the DAO directly. It calls the SOAP web services through `client/ServiceClient.java`.

The web-service implementations call the DAO/database layer.

Flow:

Swing UI → SOAP Client → SOAP Web Service → DAO → MySQL

All of this is physically stored in one NetBeans Maven project, so you do NOT need two separate NetBeans Java application projects.

## Web services

When `Main` starts, five SOAP services are published:

1. Authentication
   `http://localhost:8081/ws/auth?wsdl`
   - login(username, password)

2. Appointment
   `http://localhost:8082/ws/appointments?wsdl`
   - registerAppointment(...)

3. Search
   `http://localhost:8083/ws/search?wsdl`
   - findAppointment(appointmentId)

4. Billing
   `http://localhost:8084/ws/billing?wsdl`
   - calculateBill(appointmentId, consultationFee)

5. Report
   `http://localhost:8085/ws/report?wsdl`
   - getAppointments()

## UI separation

The UI is deliberately separated into two packages:

`ui/layout/`
- LoginLayout.java
- DashboardLayout.java
- AppointmentLayout.java
- SearchLayout.java
- BillLayout.java
- ReportLayout.java

These classes contain the Swing components and layout only.

`ui/`
- LoginFrame.java
- DashboardFrame.java
- AppointmentFrame.java
- SearchFrame.java
- BillFrame.java
- ReportFrame.java

These classes contain event handling and application logic.

This makes the layout and Java code easier to explain in the assignment/viva.

## Requirements

- JDK 17
- NetBeans 17+ recommended
- MySQL/WAMP
- Maven support in NetBeans

## Database setup

1. Start WAMP/MySQL.
2. Open phpMyAdmin or MySQL client.
3. Run `database/sunrise_dental.sql`.
4. The database name is `SunriseDental`.
5. Default login:
   - Username: `admin`
   - Password: `admin123`

If your MySQL root account has a password, edit:

`src/main/java/com/sunrisedental/util/DatabaseConnection.java`

Change `PASSWORD` to your MySQL password.

## Run in NetBeans

1. Extract the ZIP.
2. NetBeans → File → Open Project.
3. Select the extracted `SunriseDentalClinic_WebServices` folder.
4. Wait for Maven dependencies to download.
5. Clean and Build.
6. Run the project.
7. The web services start first.
8. The Login window opens.
9. Use `admin / admin123`.

Do not create another Java application project.

## Assignment mapping

- Authentication → AuthWebService
- Appointment registration → AppointmentWebService
- Appointment searching → SearchWebService
- Bill calculation → BillingWebService
- Appointment report → ReportWebService
- Distributed/web-service requirement → SOAP endpoints + SOAP client layer
- Design pattern → Factory Pattern in BillCalculatorFactory
- Database access → DAO Pattern
- Separation of UI layout and application logic → `ui/layout` and `ui`
