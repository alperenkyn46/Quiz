public class DoktorOgretimUyesi extends Akademik{
    private int maas;
    private Arac Bisiklet;

    @Override
    public int maasHesapla() {
        return maas*2;
    }

    public DoktorOgretimUyesi(int maas) {
        this.maas = maas;
        this.Bisiklet = Bisiklet;
    }



    public Arac getBisiklet() {
        return Bisiklet;
    }

    public void setBisiklet(Arac bisiklet) {
        Bisiklet = bisiklet;
    }


    public void aracTuru() {
        Bisiklet.setTuru("Bisiklet");

    }

    @Override
    public String getIsim() {
        return "Doktor Öğretim Üyesi ";
    }

    @Override
    public String Turu() {
        return "Bisiklet";
    }

    @Override
    public String toString() {
        return super.toString()+Bisiklet.toString();
    }
}