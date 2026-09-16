package Pertemuan3.Tugas;

public class Bioskop {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Bioskop(String judulFilm, double hargaDasar){
        this.judulFilm = judulFilm;
        setHarga(hargaDasar);
        this.statusPembayaran = false;
    }
    
    public void setJudul(String judul){
        judulFilm = judul;
    }

    public String getJudul(){
        return judulFilm;
    }

    public void setHarga(double harga){
        if (harga < 0) {
            this.hargaDasar = 35000.0;
        } else {
            this.hargaDasar = harga;
        }
    }

    public double getHarga(){
        return hargaDasar;
    }

    public boolean getStatus(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
        statusPembayaran = true;
    }
}
