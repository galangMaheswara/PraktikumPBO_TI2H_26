package Pertemuan3.Tugas;

public class TiketBioskop {
    public static void main(String[] args) {
        Bioskop tiket1 = new Bioskop("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudul());
        System.out.println("Harga Tiket: " + tiket1.getHarga());
        System.out.println("Status Lunas? " + tiket1.getStatus());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.getStatus());
    }
}
