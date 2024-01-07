import java.util.Random;

public class Docent extends Akademik{

    private int maas;
    private Arac Motosiklet;


    @Override
    public int maasHesapla() {
        return maas*3;
    }

    public Docent(int maas) {
        this.maas = maas;
        this.Motosiklet = Motosiklet;
    }



    public Arac getMotosiklet() {
        return Motosiklet;
    }

    public void setMotosiklet(Arac motosiklet) {
        Motosiklet = motosiklet;
    }
    public void aracTuru() {
        Motosiklet.setTuru("Motosiklet");

    }

    @Override
    public String getIsim() {
        return "Doçent ";
    }

    @Override
    public  String Turu() {
        return "Motosiklet";
    }

    @Override
    public String toString() {
        return super.toString()+Motosiklet.toString();
    }
}