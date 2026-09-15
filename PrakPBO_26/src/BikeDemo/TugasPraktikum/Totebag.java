package BikeDemo.TugasPraktikum;

public class Totebag extends Tas {
    String motif;
    double ukuran;

    public void cangklong(){
        System.out.println("Totebag " + motif + " dicangklong di bahu.");
    }

    public void setUkuran(double luasTotebag){
        ukuran = luasTotebag;
    }

    @Override
    public void cetakInfo(){
        System.out.println("Motif: " + motif);
        System.out.println("Ukuran: " + ukuran + " cm");
    }
}
