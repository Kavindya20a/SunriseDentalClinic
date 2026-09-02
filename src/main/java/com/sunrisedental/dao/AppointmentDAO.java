package com.sunrisedental.dao;
import com.sunrisedental.model.Appointment;
import com.sunrisedental.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
       public int insert(Appointment a) {

        String sql = "INSERT INTO appointments "
                + "(patient_name, address, contact_number, dentist_name, "
                + "treatment_type, appointment_date, appointment_time) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     sql,
                     Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, a.getPatientName());
            ps.setString(2, a.getAddress());
            ps.setString(3, a.getContactNumber());
            ps.setString(4, a.getDentistName());
            ps.setString(5, a.getTreatmentType());

            ps.setDate(
                    6,
                    java.sql.Date.valueOf(a.getAppointmentDate())
            );

            ps.setTime(
                    7,
                    java.sql.Time.valueOf(a.getAppointmentTime())
            );

            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new SQLException("Appointment was not inserted.");
            }

            // Get automatically generated appointment ID
            try (ResultSet rs = ps.getGeneratedKeys()) {

                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

            throw new SQLException(
                    "Appointment inserted but ID could not be retrieved."
            );

        } catch (SQLException e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Database error: " + e.getMessage(),
                    e
            );
        }
    }


    // SAVE APPOINTMENT
    public boolean saveAppointment(Appointment a) {
        return insert(a) > 0;
    }


    // FIND ONE APPOINTMENT
    public Appointment findById(int appointmentId) {

        String sql = "SELECT * FROM appointments "
                + "WHERE appointment_id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Appointment a = new Appointment();

                    a.setAppointmentId(
                            rs.getInt("appointment_id")
                    );

                    a.setPatientName(
                            rs.getString("patient_name")
                    );

                    a.setAddress(
                            rs.getString("address")
                    );

                    a.setContactNumber(
                            rs.getString("contact_number")
                    );

                    a.setDentistName(
                            rs.getString("dentist_name")
                    );

                    a.setTreatmentType(
                            rs.getString("treatment_type")
                    );

                    a.setAppointmentDate(
                            rs.getDate("appointment_date")
                                    .toLocalDate()
                    );

                    a.setAppointmentTime(
                            rs.getTime("appointment_time")
                                    .toLocalTime()
                    );

                    return a;
                }
            }

        } catch (SQLException e) {

            throw new RuntimeException(
                    "Database error: " + e.getMessage(),
                    e
            );
        }

        return null;
    }


    // FIND ALL APPOINTMENTS
    public List<Appointment> findAll() {

        List<Appointment> appointments = new ArrayList<>();

        String sql = "SELECT * FROM appointments "
                + "ORDER BY appointment_date, appointment_time";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Appointment a = new Appointment();

                a.setAppointmentId(
                        rs.getInt("appointment_id")
                );

                a.setPatientName(
                        rs.getString("patient_name")
                );

                a.setAddress(
                        rs.getString("address")
                );

                a.setContactNumber(
                        rs.getString("contact_number")
                );

                a.setDentistName(
                        rs.getString("dentist_name")
                );

                a.setTreatmentType(
                        rs.getString("treatment_type")
                );

                a.setAppointmentDate(
                        rs.getDate("appointment_date")
                                .toLocalDate()
                );

                a.setAppointmentTime(
                        rs.getTime("appointment_time")
                                .toLocalTime()
                );

                appointments.add(a);
            }

        } catch (SQLException e) {

            throw new RuntimeException(
                    "Database error: " + e.getMessage(),
                    e
            );
        }

        return appointments;
    }
}
