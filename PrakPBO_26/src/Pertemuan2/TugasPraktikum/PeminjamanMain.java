package Pertemuan2.TugasPraktikum;

public class PeminjamanMain {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();

        p1.id = "101";
        p1.namaMember = "Ricky";
        p1.namaGame = "God Of War Ragnarok";
        p1.lamaSewa = 3;
        p1.harga = 30000;
        p1.tampilData();
        System.out.println();
        p1.tampilDetailSewa();
    }
}
