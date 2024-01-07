import java.util.Random;

public class Profesor extends Akademik{
    private int maas;
    private Arac Araba;

    @Override
    public int maasHesapla() {
        return maas*5;
    }



    public Profesor(int maas) {
        this.maas = maas;
        this.Araba = Araba;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;

    }


    public Arac getAraba() {
        return Araba;
    }

    public void setAraba(Arac araba) {
        Araba = araba;
    }


    @Override
    public String getIsim() {
        return "Profesör ";
    }

    @Override
    public String Turu() {
        return "Araba";
    }

    @Override
    public String toString() {
        return super.toString()+getAraba();
    }
}

