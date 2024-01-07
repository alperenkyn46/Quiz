public class Arac {
    public String YakitTuru;
    public String marka,model,yakitTuru,Turu,Akademisyen;
    private int tekerlekSayisi,motorGucu;

    public Arac(String marka, String model, String yakitTuru, int tekerlekSayisi, int motorGucu,String Turu,String Akademisyen) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.tekerlekSayisi = tekerlekSayisi;
        this.Akademisyen=Akademisyen;
        this.motorGucu = motorGucu;
        this.Turu=Turu;
    }

    public String getAkademisyen() {
        return Akademisyen;
    }

    public void setAkademisyen(String akademisyen) {
        Akademisyen = akademisyen;
    }

    public ArastirmaGorevlisi arastirmaGorevlisi;

    public ArastirmaGorevlisi getAg() {
        return arastirmaGorevlisi;
    }

    public void setAg(ArastirmaGorevlisi arastirmaGorevlisi) {
        this.arastirmaGorevlisi = arastirmaGorevlisi;
    }

    public String getTuru() {
        return Turu;
    }

    public void setTuru(String turu) {
        Turu = turu;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public int getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(int motorGucu) {
        this.motorGucu = motorGucu;
    }

    private void arabaTuru(){

    }


    @Override
    public String toString() {
        return "Aracın Markasi: "+marka+" Modeli: "+model+" Yakıt Türü: "+yakitTuru+" Tekerlek Sayısı: "+tekerlekSayisi
                +" Motor Gücü: "+motorGucu;
    }
}
