package Pertemuan4.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Penumpang p2 = new Penumpang("124", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p1, 1);
        gerbong.setPenumpang(p2, 1);
        System.out.println(gerbong.info());
    }
}
