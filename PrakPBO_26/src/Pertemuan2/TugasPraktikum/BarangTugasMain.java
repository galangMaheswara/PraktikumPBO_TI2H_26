package Pertemuan2.TugasPraktikum;

public class BarangTugasMain {
    public static void main(String[] args) {
        BarangTugas br = new BarangTugas();

        br.kode = "001";
        br.hargaDasar = 40000;
        br.diskon = 40;
        br.namaBarang = "Baterai AA";
        br.hitungHargaJual();
        br.tampilData();

        System.out.println();

        br.kode = "002";
        br.hargaDasar = 15000;
        br.diskon = 10;
        br.namaBarang = "Gelas Plastik";
        br.hitungHargaJual();
        br.tampilData();
    }
}
