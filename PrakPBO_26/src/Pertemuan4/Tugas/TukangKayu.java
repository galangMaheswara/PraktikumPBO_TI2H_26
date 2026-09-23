package Pertemuan4.Tugas;

public class TukangKayu {
    private String nama;

    public TukangKayu(String nama) {
        this.nama = nama;
    }

    public void potongKayu(BahanKayu k, int ukuranPotong) {
        System.out.println("Tukang " + nama + " memotong kayu " + k.getJenisKayu() + " sebanyak " + ukuranPotong + " cm.");
    }
}
