package Pertemuan2.TugasPraktikum;

public class Peminjaman {
    String id;
    String namaMember;
    String namaGame;
    int harga;
    int lamaSewa;

    public void tampilData(){
        System.out.println("ID         :" + id);
        System.out.println("Nama Member:" + namaMember);
        System.out.println("Nama Game  :" + namaGame);
       
    }
    
    public void tampilDetailSewa(){
        System.out.println("====DETAIL PERSEWAAN====");
        System.out.println("Nama Game  :" + namaGame);
        System.out.println("Harga  :" + harga);
        System.out.println("Lama sewa  :" + lamaSewa + " hari");
    }
}