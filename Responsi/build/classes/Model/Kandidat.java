package model;

public class Kandidat extends Pendaftar {

    private static final double BATAS_MINIMUM = 82.5;

    public Kandidat() { super(); }

    public Kandidat(int id, String nama, String jalur,
                    double nilaiIpk, double nilaiPortofolio, double nilaiWawancara) {
        super(id, nama, jalur, nilaiIpk, nilaiPortofolio, nilaiWawancara);
    }

    public Kandidat(String nama, String jalur,
                    double nilaiIpk, double nilaiPortofolio, double nilaiWawancara) {
        super(0, nama, jalur, nilaiIpk, nilaiPortofolio, nilaiWawancara);
    }

    @Override
    public double hitungScore() {
        if (jalur.equals("Jalur Akademik")) {
            return (nilaiIpk * 0.50) + (nilaiPortofolio * 0.20) + (nilaiWawancara * 0.30);
        } else {
            return (nilaiIpk * 0.20) + (nilaiPortofolio * 0.50) + (nilaiWawancara * 0.30);
        }
    }

    @Override
    public String getStatus() {
        return hitungScore() >= BATAS_MINIMUM ? "LULUS" : "TIDAK LULUS";
    }

    public static double getBatasMinimum() { return BATAS_MINIMUM; }

}
