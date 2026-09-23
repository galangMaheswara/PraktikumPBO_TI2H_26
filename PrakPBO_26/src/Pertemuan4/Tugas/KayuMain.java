package Pertemuan4.Tugas;

public class KayuMain {
    public static void main(String[] args) {
        Mebel mejaJati = new Mebel("Meja Makan", "Jati Jepara", 4);
        Pelanggan p1 = new Pelanggan("Daniel");

        p1.setPesanan(mejaJati);
        p1.info();

        TukangKayu t1 = new TukangKayu("Bondan");
        BahanKayu kayuPinus = new BahanKayu("Pinus", 3);
        t1.potongKayu(kayuPinus, 1);
    }
}
