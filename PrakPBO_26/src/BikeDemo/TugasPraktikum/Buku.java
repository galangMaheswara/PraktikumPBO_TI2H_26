package BikeDemo.TugasPraktikum;

public class Buku {
    String warnaBuku;
    String ukuranBuku;

    public void bukaBuku() {
        System.out.println("Buku " + warnaBuku + " dengan ukuran" + ukuranBuku + " telah dibuka");
    }

    public void tutupBuku() {
        System.out.println("Buku " + warnaBuku + " dengan ukuran" + ukuranBuku + " telah ditutup");
    }

    public void cetakInfo(){
        System.out.println("Warna Buku: " + warnaBuku);
        System.out.println("Ukuran Buku: " + ukuranBuku + " cm");
    }
}