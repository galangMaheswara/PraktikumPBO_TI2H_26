package Pertemuan3.Tugas;

import java.util.Scanner;

public class TesLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        
        System.out.println("=== MANAJEMEN KONTAINER KARGO ===");
        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNama());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("=================================");

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah(kg): ");
        double tambah1 = sc.nextDouble();
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini " + kontainerAlfa.getBeratMuatanSaatIni() + (" kg"));

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah(kg): ");
        double tambah2 = sc.nextDouble();
        kontainerAlfa.tambahMuatan(tambah2);
        System.out.println("Berat muatan saat ini " + kontainerAlfa.getBeratMuatanSaatIni() + (" kg"));

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan(kg): ");
        double kurang1 = sc.nextDouble();
        kontainerAlfa.kurangiMuatan(kurang1);
        System.out.println("Berat muatan saat ini " + kontainerAlfa.getBeratMuatanSaatIni() + (" kg"));

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan(kg): ");
        double kurang2 = sc.nextDouble();
        kontainerAlfa.kurangiMuatan(kurang2);
        System.out.println("Berat muatan saat ini " + kontainerAlfa.getBeratMuatanSaatIni() + (" kg"));
        sc.close();
    }
}
