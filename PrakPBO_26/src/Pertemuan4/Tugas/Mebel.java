package Pertemuan4.Tugas;

public class Mebel {
    private String jenisMebel;
    private BahanKayu jenisKayu;

    public Mebel(String jenisMebel, String jenisKayu, int ketebalan){
        this.jenisMebel = jenisMebel;
        this.jenisKayu = new BahanKayu(jenisKayu, ketebalan);
    }

    public void info() {
        System.out.println("Mebel: " + jenisMebel);
        jenisKayu.info();
    }
}
