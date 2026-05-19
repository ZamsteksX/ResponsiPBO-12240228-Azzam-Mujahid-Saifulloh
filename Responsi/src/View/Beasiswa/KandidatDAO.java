/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import model.Kandidat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class KandidatDAO implements CRUDInterface {
    @Overridepublic bolean tambah(Kandidat k){
        String sql="INSERT INTO kandidat (name,path,ipk,portofolio,wawancara,score,status)"
                +"VALUES(?,?,?,?,?,?,?)";
        
        try (Connection c = DBConnection.getConnection();
                Statement st = c.createStatement();
                Result rs = st.executeQuery("SELECT * FROM Kandidat")){
            while (rs.next()){
                List.add(new Kandidat(rs.getint("id"),rs.getString("name"), rs.getString("path"), rs.getDouble("ipk"), rs.getDouble("portofolio"), rs.getDouble("wawancara")));
            }
        }catch (SQLException e){
            System.err.println("Error getAll: " +e.getMessage());
        }
        return List;
    }
    @Override
    public boolean
}
