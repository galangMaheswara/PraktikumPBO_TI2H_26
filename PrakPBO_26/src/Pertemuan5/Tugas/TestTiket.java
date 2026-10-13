package Pertemuan5.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        // Objek 1: TiketKereta menggunakan no-argument constructor & setter manual
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.setHargaDasar(35000);
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";

        // Objek 2: TiketDomestik menggunakan parameterized constructor
        TiketDomestik td = new TiketDomestik(
            "GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000
        );

        // Objek 3: TiketInternasional menggunakan parameterized constructor
        TiketInternasional ti = new TiketInternasional(
            "SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000
        );

        // Menampilkan output
        tk.tampilKereta();
        td.tampilDomestik();
        ti.tampilInternasional();
    }    
}
