package Pertemuan9.Tugas;

public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang() {
    }

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public void displayBinatang(){
        System.out.println("Nama: " + getNama());
        System.out.println("Jumlah Kaki: " + getJmlKaki());
    }
}
