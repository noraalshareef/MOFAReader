/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.sa.gov.nic.db;
import java.sql.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import main.java.sa.gov.nic.Entity.Applicant;
/**
 *
 * @author anoud
 */
public class AfisBroker {
    
    
    public static String sql = "select REF_NUMBER, FACIAL_PHOTO, RTHUMB, RINDEX ,RMIDDLE,RRING,RLITTLE, LTHUMB,LINDEX,LMIDDLE,LRING,LLITTLE,NAME,PASSPORT_NUMBER,NATIONALITY, LOCATION_ID , AGENT_ID ,\n" +
"       RECEIVE_TIME from mofa.MOFA_ENROLLMENT with (nolock) where REF_NUMBER = ?"; 
    
    public static Connection getAFISERConnection() throws SQLException {

        String afiserConnection = "jdbc:sqlserver://10.0.71.95:1433;databasName=Biometrics", afiserDBUsername = "Mofa_reader", afiserDBPassword = "$Mof@321";

        return DriverManager.getConnection(afiserConnection, afiserDBUsername, afiserDBPassword);

    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        if (statement != null)
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        if (connection != null)
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
public static Applicant getApplicants(long ref) {
        try {
 
            Connection connection = getAFISERConnection();

            //AGENT_ID='SVTS\\MobileAppAdmin' and PASSPORT_NUMBER='NIC'\n";

            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                stmt = connection.prepareStatement(sql);
                
                stmt.setLong(1, ref);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    Applicant a = new Applicant(rs.getLong("REF_NUMBER"), rs.getBytes("FACIAL_PHOTO"),
       rs.getBytes("RTHUMB"), rs.getBytes("RINDEX"), rs.getBytes("RMIDDLE"), rs.getBytes("RRING"), rs.getBytes("RLITTLE"),
       rs.getBytes("LTHUMB"), rs.getBytes("LINDEX"), rs.getBytes("LMIDDLE"), rs.getBytes("LRING"), rs.getBytes("LLITTLE")
     , rs.getString("NAME"),rs.getString("NATIONALITY"),rs.getString("PASSPORT_NUMBER"),rs.getString("LOCATION_ID"),rs.getString("AGENT_ID"),rs.getDate("RECEVIE_TIME").toString());

                }

            } finally {
                close(rs, stmt, connection);
            }
     

        } catch (SQLException e) {
            System.out.println(Arrays.asList(e.getStackTrace()));
        }
        return null;
    }
}

