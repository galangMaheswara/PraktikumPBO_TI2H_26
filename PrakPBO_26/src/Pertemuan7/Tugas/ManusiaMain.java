package Pertemuan7.Tugas;

public class ManusiaMain {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        System.out.println("=== Pemanggilan Method dari Objek Manusia ===");
        manusia.bernafas();
        manusia.makan();
        
        System.out.println("\n=== Dynamic Method Dispatch (Objek Dosen) ===");
        dosen.bernafas(); 
        dosen.makan();    
        
        System.out.println("\n=== Dynamic Method Dispatch (Objek Mahasiswa) ===");
        mahasiswa.bernafas(); 
        mahasiswa.makan();    
    }
}