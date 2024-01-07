import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Asgari Ücreti Giriniz: ");

        int a = input.nextInt();


        Insan profesor = new Profesor(a);
        Insan docent = new Docent(a);
        Insan docent1= new Docent(a);
        Insan doktorOgretimUyesi = new DoktorOgretimUyesi(a);
        Insan doktorOgretimUyesi1 = new DoktorOgretimUyesi(a);
        Insan doktorOgretimUyesi2 = new DoktorOgretimUyesi(a);
        Insan arastirmaGorevlisi = new ArastirmaGorevlisi(a);

        Insan [] dizin={arastirmaGorevlisi,docent,docent1,doktorOgretimUyesi1,doktorOgretimUyesi2,doktorOgretimUyesi,profesor};


        Arac arac = new Arac("Martı","martı","Elektrik",2,100,"Scother","Araştırma Görevlisi");
        Arac arac1= new Arac("BMX","bmx","Yok",2,0,"Bisiklet","Doktor Öğretim Üyesi");
        Arac arac2= new Arac("Solcano","solcano","Yok",2,0,"Bisiklet","Doktor Öğretim Üyesi");
        Arac arac3= new Arac("Bianchi","bianchi","Yok",2,0,"Bisiklet","Doktor Öğretim Üyesi");
        Arac arac4= new Arac("Honda","honda","LPG",2,250,"Motosiklet","Doçent");
        Arac arac5= new Arac("Kawasaki","kawasaki","Yok",2,1000,"Motosiklet","Doçent");
        Arac arac6= new Arac("Ford","focus","Dizel",4,120,"Araba","Profesör");

        Arac [] dizi={arac,arac1,arac2,arac3,arac4,arac5,arac6};
        for(Arac value:dizi){
            System.out.println(value);
        }


        for( Insan value:dizin)
        {
            Random r = new Random();
            int x = r.nextInt(dizin.length);
            if(value.Turu().equals(dizi[x].getTuru())){
                System.out.println(value.getIsim()+"Doğru bir araç ile eşleşme sağlandı mevcut arabanızı başka bir akademisyenin kullanımına sununuz.");
            }
            else {
                System.out.println(value.getIsim()+"Sayın Akademisyenimiz "+dizi[x].getAkademisyen()+" Olunca "+dizi[x].getTuru()+" Alabilirsiniz." );
            }
        }
        System.out.println("-----------\nAkademisyen Maaşları\n-----------------");
        for(Insan value:dizin){
            System.out.println(value.getIsim()+" Maaşı: "+value.maasHesapla());
        }


    }}
