/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.gov.nic.db;
import java.sql.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import sa.gov.nic.Entity.Applicant;
/**
 *
 * @author anoud
 */
public class AfisBroker {
    
    
    public static String refSql = "";

    public static String passSql = "";
    public static Connection getAFISERConnection() throws SQLException {

        String afiserConnection = "";

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
public static Applicant getApplicants(long ref)  throws SQLException{

 
            Connection connection = getAFISERConnection();

            //AGENT_ID='SVTS\\MobileAppAdmin' and PASSPORT_NUMBER='NIC'\n";

            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                stmt = connection.prepareStatement(refSql);

                System.out.println(" step 1 ");
                stmt.setLong(1, ref);

                System.out.println(" step 2 ");
                rs = stmt.executeQuery();

                System.out.println(" step 3 ");

                if (rs.next()) {
                    System.out.println(" step 4 ");
                    Applicant a = new Applicant(rs.getLong("REF_NUMBER"), rs.getBytes("FACIAL_PHOTO"),
       rs.getBytes("RTHUMB"), rs.getBytes("RINDEX"), rs.getBytes("RMIDDLE"), rs.getBytes("RRING"), rs.getBytes("RLITTLE"),
       rs.getBytes("LTHUMB"), rs.getBytes("LINDEX"), rs.getBytes("LMIDDLE"), rs.getBytes("LRING"), rs.getBytes("LLITTLE")
     , rs.getString("NAME"),rs.getString("NATIONALITY"),rs.getString("PASSPORT_NUMBER"),rs.getString("LOCATION_ID"),rs.getString("AGENT_ID"),rs.getDate("RECEIVE_TIME").toString());

                    return a;
                }

            } finally {
                close(rs, stmt, connection);
            }
     

        return null;
    }
    ////////////////////
    public static Applicant getApplicants(String passport,String nationality)  throws SQLException{


        Connection connection = getAFISERConnection();

        //AGENT_ID='SVTS\\MobileAppAdmin' and PASSPORT_NUMBER='NIC'\n";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = connection.prepareStatement(passSql);

            stmt.setString(1, passport);
            stmt.setString(2, nationality);
            rs = stmt.executeQuery();


            if (rs.next()) {
                Applicant a = new Applicant(rs.getLong("REF_NUMBER"), rs.getBytes("FACIAL_PHOTO"),
                        rs.getBytes("RTHUMB"), rs.getBytes("RINDEX"), rs.getBytes("RMIDDLE"), rs.getBytes("RRING"), rs.getBytes("RLITTLE"),
                        rs.getBytes("LTHUMB"), rs.getBytes("LINDEX"), rs.getBytes("LMIDDLE"), rs.getBytes("LRING"), rs.getBytes("LLITTLE")
                        , rs.getString("NAME"),rs.getString("NATIONALITY"),rs.getString("PASSPORT_NUMBER"),rs.getString("LOCATION_ID"),rs.getString("AGENT_ID"),rs.getDate("RECEIVE_TIME").toString());

                return a;
            }

        } finally {
            close(rs, stmt, connection);
        }


        return null;
    }

}

