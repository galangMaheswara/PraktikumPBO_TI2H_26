package Pertemuan3.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;


    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if (kontakOn == true && kecepatan < 100) {
            kecepatan += 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off / kecepatan sudah maksimal! \n");
        }
    }

    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else{
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " + kecepatan + "(MAX = 100)" + "\n");
    }
}