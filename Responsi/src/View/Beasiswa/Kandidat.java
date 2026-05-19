/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Kandidat extends Pendaftar {
    private static final double BATAS_MINIMUM=82.5;
    public Kandidat(){super();}
    public Kandidat(int id, String name, String path, double ipk, double portofolio, double wawancara){
        super(id, name, path, ipk, portofolio, wawancara);
    }
    public Kandidat(String name, String path, double ipk, double portofolio, double wawancara){
        super(0,name,path,ipk,portofolio,wawancara);
    }
    
    @Override
    public double hitungScore(){
        return(ipk + portofolio + wawancara)/ 3.0;
    }
    @Override
    public String getStatus(){
        return hitungScore()>= BATAS_MINIMUM?"DITERIMA":"TIDAK DITERIMA";
    }
    public static double getBatasMinimum(){return BATAS_MINIMUM;
}
