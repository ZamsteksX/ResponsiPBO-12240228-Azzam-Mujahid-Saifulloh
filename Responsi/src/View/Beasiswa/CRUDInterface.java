/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.List;
import model.Kandidat;

/**
 *
 * @author Lab Informatika
 */
public interface CRUDInterface {
    boolean tambah(Kandidat kandidat);
    List<Kandidat> getAll();
    boolean update(Kandidat kandidat);
    boolean delete(int id);
}
