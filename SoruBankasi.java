
package sorubankasi;
import java.util.Scanner;
import java.util.Vector;

public class SoruBankasi {
    enum Secenek {YAPILMADI, EKLE, SIL, LISTELE, CIKIS}
    static Vector<Soru> sorular=null;
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        sorular=new Vector<>(50);
        Secenek secim = Secenek.YAPILMADI;
        do  {
            ekranaSecimListesiniGetir();
            secim=secimiAl();
            secimiCalistir(secim);
            } while(secim != Secenek.CIKIS);
    }
    private static Secenek secimiAl(){
        Secenek secilen = Secenek.YAPILMADI;
        int secim = input.nextInt();
        switch (secim){
            case 1:
                     secilen = Secenek.EKLE;
                     break;
            case 2:
                     secilen = Secenek.SIL;
                     break;
            case 3:  
                     secilen = Secenek.LISTELE;
                     break;
            case 4:
                     secilen = Secenek.CIKIS;
                     break;
            default:
                     break;
                    }
             
             return secilen;   
    }
    
    private static void ekranaSecimListesiniGetir(){
               System.out.println("*************************");
               System.out.println("*                       *");
               System.out.println("* 1. Soru Ekle          *");
               System.out.println("* 2. Soru Sil           *");
               System.out.println("* 3. Soruları Listele   *");
               System.out.println("* 4. Çıkış              *");
               System.out.println("*                       *");
               System.out.println("*************************");
               System.out.print("* Seçiniz:  ");
    }
    
    private static void secimiCalistir(Secenek secim){
        switch(secim){
            case EKLE:
                     soruEkle();
                     break;
            case SIL:
                     soruSil();
                     break;
            case LISTELE:
                     soruListele();
                     break;
            default: 
                     break;
                    
        }
      }
    
    private static void soruListele(){
        int i = 1;
        System.out.println("\n-------SORULAR-------\n\n");
        for (Soru soru:sorular){
            System.out.println(i+"-->"+soru);
            i++;
        }
             System.out.println("\n-------SORULAR-------\n\n");
        
    }
    private static void soruSil(){
        System.out.println("Silicenek Sorunun Numarasını Giriniz.");
        int index = input.nextInt();
        if (index > sorular.size()) {
        System.out.println("Hata! Kayıt Bulunamadı.");
    }
        else {
                Soru s = sorular.get(index-1);
                sorular.remove(index-1);
                System.out.println(s+"Soru Silindi");
                }
    }
    
    private static void soruEkle(){
        Soru s=new Soru();
        System.out.println("Soru Bilgilerini Sırayla Giriniz");
        System.out.println("Soru Metnini Boşluk Bırakmadan Giriniz");
        
        String soru=input.next().trim();
        s.setSoru(soru);
        
        System.out.println("Sırasıyla A,B ve C Şıklarını Giriniz");
        String cvpA=input.next().trim();
        s.setCvpA(cvpA);
        String cvpB=input.next().trim();
        s.setCvpB(cvpB);
        String cvpC=input.next().trim();
        s.setCvpC(cvpC);
        
        System.out.println("Sorunun Doğru Cevabını Girin");
        String cvp=input.next().trim();
        s.setCvp(cvp);
        
        System.out.println("Sorunun Puanını Giriniz");
        String puan=input.next().trim();
        s.setPuan(puan);
        
        System.out.println("Sorunun Zorluk Derecesini Giriniz");
        String zrlk=input.next().trim();
        s.setZrlk(zrlk);
        
        
        sorular.add(s); //Soru eklendi
        System.out.println("Soru Başarıyla Eklendi");
        }
}
