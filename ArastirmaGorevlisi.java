public class ArastirmaGorevlisi extends Akademik{

    private Arac Scother;
    private int maas;


    public ArastirmaGorevlisi(int maas) {
        this.Scother = Scother;
        this.maas=maas;
    }

    @Override
    public String getIsim() {
        return "Araştırma Görevlisi ";
    }

    public Arac getScother() {
        return Scother;
    }

    public void setScother(Arac scother) {
        Scother = scother;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public int maasHesapla() {
        return (maas*15)/10;
    }


    @Override
    public String Turu() {
        return "Scother";
    }

    @Override
    public String toString() {
        return super.toString()+Scother.toString();
    }
}

