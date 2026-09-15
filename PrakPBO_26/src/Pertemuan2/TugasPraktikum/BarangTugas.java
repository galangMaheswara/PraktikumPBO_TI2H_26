package Pertemuan2.TugasPraktikum;

public class BarangTugas {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public float hitungHargaJual(){
        float hargaJual = hargaDasar - (diskon/100*hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga jual: " + hitungHargaJual());
    }
}
