package com.sunrisedental.dao;

import com.sunrisedental.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TreatmentPriceDAO {

    public double findPriceByTreatment(String treatmentType) throws Exception {

        String sql = "SELECT price FROM treatment_prices WHERE treatment_type = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, treatmentType);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return rs.getDouble("price");
                }
            }
        }

        return -1;
    }
}