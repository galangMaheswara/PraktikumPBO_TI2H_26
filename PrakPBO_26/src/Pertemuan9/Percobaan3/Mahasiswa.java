package Pertemuan9.Percobaan3;

public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + nama);
        System.out.println("Aku berkuiah di kampus.");
    }
}
