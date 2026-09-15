package BikeDemo.TugasPraktikum;

public class Pulpen {
    String warnaTinta;
    double ukuranUjung;

    public void tekan() {
        System.out.println("Ujung pulpen dikeluarkan.");
    }

    public void tulisTeks() {
        System.out.println("Menulis dengan tinta warna " + warnaTinta);
    }

    public void cetakInfo(){
        System.out.println("Warna Tinta  : " + warnaTinta);
        System.out.println("Ukuran Ujung : " + ukuranUjung + " mm");
    }
}
