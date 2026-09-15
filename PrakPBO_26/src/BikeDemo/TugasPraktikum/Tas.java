package BikeDemo.TugasPraktikum;

public class Tas {
    String merk;
    String bahan;


    public void bukaTas(){
        System.out.println("Tas " + merk + " terbuka");
    }

    public void tutupTas(){
        System.out.println("Tas " + merk + " tertutup");
    }

    public void cetakInfo(){
        System.out.println("Merk  : " + merk);
        System.out.println("Bahan : " + bahan);
    }
}
