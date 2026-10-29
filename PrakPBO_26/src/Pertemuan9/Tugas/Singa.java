package Pertemuan9.Tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;
    
    public Singa() {
        
    }
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayBinatang() {
        super.displayBinatang();
    }
    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }

    public void displayData() {
        displayMakan();
        super.displayBinatang();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
        System.out.println();
    }
}
