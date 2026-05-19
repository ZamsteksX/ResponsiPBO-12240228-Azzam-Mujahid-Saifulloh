/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public abstract class Pendaftar {
    protected int id;
    protected String name;
    protected String path;
    protected double ipk;
    protected double portofolio;
    protected double wawancara;
    
    public Pendaftar(){}
    public Pendaftar(int id, String name, String path, double ipk, double portofolio, double wawancara){
        this.id = id; this.name = name; this path = path; this.ipk = ipk; this.portofolio = portofolio; this.wawancara = wawancara;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id=id;}
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public String getPath() {return path;}
    public void setPath(String path) {this.path=path;}
    public double getIpk() {return ipk;}
    public void setIpk(double v) {this.ipk=v;}
    public double getPortofolio() {return portofolio;}
    public void setPortofolio(double v) {this.portofolio=v;}
    public double getWawancara() {return wawancara;}
    public void setWawancara(double v) {this.wawancara=v;}
    public abstract double hitungScore();
    public abstract String getStatus();
}
