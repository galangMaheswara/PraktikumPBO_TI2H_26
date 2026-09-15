package BikeDemo.TugasPraktikum;

public class TasDemo {
    public static void main(String[] args) {
        Tepak tepak1 = new Tepak();
        Totebag totebag1 = new Totebag();
        Buku buku1 = new Buku();
        Pulpen pulpen1 = new Pulpen();

        System.out.println("====TOTEBAG====");
        totebag1.merk = "Batik Indonesia";
        totebag1.bahan = "Kanvas";
        totebag1.motif = "Mega Mendung";
        totebag1.setUkuran(35.5);

        totebag1.cetakInfo();
        totebag1.bukaTas();
        totebag1.tutupTas();
        totebag1.cangklong();

        System.out.println("\n====TEPAK====");
        tepak1.merk = "Faber-Castell";
        tepak1.bahan = "Polyester";
        tepak1.setJumlahKompartemen(3);
        tepak1.jenisPenutup = "Resleting";

        tepak1.cetakInfo();
        tepak1.bukaTas();
        tepak1.simpanAlatTulis();
        tepak1.tutupTas();
        tepak1.ambilAlatTulis();

        System.out.println("\n====BUKU====");
        buku1.warnaBuku = "Biru";
        buku1.ukuranBuku = "A5";

        buku1.cetakInfo();
        buku1.bukaBuku();
        buku1.tutupBuku();
        System.out.println();

        System.out.println("===== PULPEN ====");
        pulpen1.warnaTinta = "Hitam";
        pulpen1.ukuranUjung = 0.5;

        pulpen1.cetakInfo();
        pulpen1.tekan();
        pulpen1.tulisTeks();
    }
}
