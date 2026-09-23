package Pertemuan4.Tugas;

public class Pelanggan {
    private String nama;
    private Mebel pesanan;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public void setPesanan(Mebel pesanan) {
        this.pesanan = pesanan;
    }

    public void info() {
        System.out.println("Pelanggan: " + nama);
        if (pesanan != null) {
            pesanan.info();
        } else {
            System.out.println("Belum ada pesanan.");
        }
    }
}
