package Pertemuan5.Tugas;

public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    private int hargaDasar;

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public int getHargaDasar() {
    return hargaDasar;
    }

    public void setHargaDasar(int hargaDasar){
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.println("Kode Tiket\t= " + kodeTiket);
        System.out.println("Nama Penumpang\t= " + namaPenumpang);
        System.out.println("Rute\t\t= " + asal + " - " + tujuan);
        System.out.println("Harga Dasar\t= " + hargaDasar);
    }
}
