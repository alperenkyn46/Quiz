public abstract class Insan {
    private String isim,Soyisim;
    private int yas;
    private Arac Araba;
    private boolean ehliyet;
    public  abstract String Turu();
    public String tasit;
    public abstract int maasHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", Soyisim='" + Soyisim + '\'' +
                ", yas=" + yas +
                ", ehliyet=" + ehliyet +
                '}';
    }
}