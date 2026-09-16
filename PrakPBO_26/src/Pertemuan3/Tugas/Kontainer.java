package Pertemuan3.Tugas;

public class Kontainer {
    private String noResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni; 

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.noResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0; 
    }

    public String getNoResi(){
        return noResi;
    }

    public String getNama(){
        return namaPemilik;
    }

    public double getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat){
        if (beratMuatanSaatIni + berat > kapasitasMaksimal) {
            System.out.println("Berat muatan melebihi batas maksimal");
        } else{
            beratMuatanSaatIni += berat;
        }
    }

    public  void kurangiMuatan(double berat){
        if (beratMuatanSaatIni - berat < 0) {
            System.out.println("Berat muatan yang diturunkan melebihi muatan saat ini");
        } else{
            beratMuatanSaatIni -= berat;
        }
    }
}
