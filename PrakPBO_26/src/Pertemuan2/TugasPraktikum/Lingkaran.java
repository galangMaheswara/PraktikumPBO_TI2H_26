package Pertemuan2.TugasPraktikum;

public class Lingkaran {
    public double phi;
    public double r;

    public double hitungLuas(double jariJari){
        double luas = phi*jariJari*jariJari;
        return luas;
    }

    public double hitungKeliling(double jariJari){
        double keliling = phi*2*jariJari;
        return keliling;
    }

    public void tampilHasil(){
        System.out.println("Hasil hitung luas: " + hitungLuas(r));
        System.out.println("Hasil hitung keliling: " + hitungKeliling(r));
    }
}
