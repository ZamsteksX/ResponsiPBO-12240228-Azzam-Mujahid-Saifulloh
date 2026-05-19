package model;

public abstract class Pendaftar {

    protected int id;
    protected String nama;
    protected String jalur;
    protected double nilaiIpk;
    protected double nilaiPortofolio;
    protected double nilaiWawancara;

    public Pendaftar() {}

    public Pendaftar(int id, String nama, String jalur,
                     double nilaiIpk, double nilaiPortofolio, double nilaiWawancara) {
        this.id = id; this.nama = nama; this.jalur = jalur;
        this.nilaiIpk = nilaiIpk; this.nilaiPortofolio = nilaiPortofolio;
        this.nilaiWawancara = nilaiWawancara;
    }

    public int getId()                          { return id; }
    public void setId(int id)                   { this.id = id; }
    public String getNama()                     { return nama; }
    public void setNama(String nama)            { this.nama = nama; }
    public String getJalur()                    { return jalur; }
    public void setJalur(String jalur)          { this.jalur = jalur; }
    public double getNilaiIpk()                 { return nilaiIpk; }
    public void setNilaiIpk(double v)           { this.nilaiIpk = v; }
    public double getNilaiPortofolio()          { return nilaiPortofolio; }
    public void setNilaiPortofolio(double v)    { this.nilaiPortofolio = v; }
    public double getNilaiWawancara()           { return nilaiWawancara; }
    public void setNilaiWawancara(double v)     { this.nilaiWawancara = v; }

    public abstract double hitungScore();
    public abstract String getStatus();

}
