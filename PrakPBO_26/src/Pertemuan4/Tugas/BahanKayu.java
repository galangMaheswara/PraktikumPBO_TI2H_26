package Pertemuan4.Tugas;

public class BahanKayu {
    private String jenisKayu;
    private int ketebalan;

    public BahanKayu(String jenisKayu, int ketebalan) {
        this.jenisKayu = jenisKayu;
        this.ketebalan = ketebalan;
    }

    public String getJenisKayu() {
        return jenisKayu;
    }

    public void info() {
        System.out.println("Kayu: " + jenisKayu + " (Tebal: " + ketebalan + " cm)");
    }
}
