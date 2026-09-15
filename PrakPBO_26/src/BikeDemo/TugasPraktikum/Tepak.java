package BikeDemo.TugasPraktikum;

public class Tepak extends Tas {
    int jumlahKompartemen;
    String jenisPenutup;

    public void setJumlahKompartemen(int kompartemen) {
        this.jumlahKompartemen = kompartemen;
    }
    
    public void simpanAlatTulis() {
        System.out.println("Alat tulis sudah disimpan");
    }

    public void ambilAlatTulis() {
        System.out.println("Alat tulis sudah diambil");
    }

    @Override
    public void cetakInfo(){
        System.out.println("Jumlah Kompartemen: " + jumlahKompartemen);
        System.out.println("Jenis Penutup: " + jenisPenutup);
    }
}
