package Pertemuan7.Tugas;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        
        System.out.println("Total Sudut (1 parameter) : " + sgt.totalSudut(90));
        System.out.println("Total Sudut (2 parameter) : " + sgt.totalSudut(90, 45));
        System.out.println("Keliling (3 parameter)    : " + sgt.keliling(10, 15, 20));
        System.out.println("Keliling (2 parameter)    : " + sgt.keliling(3, 4));
    }
}
