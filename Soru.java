
package sorubankasi;

public class Soru {
     private String soru,cvpA,cvpB,cvpC; //Soru metni ve Şıklar
     private String cvp; // Doğru şık.Karşılaştırma için kullanılacak.
     private String puan;
     private String zrlk;
     
     public Soru(){
         this.soru= "";
         this.cvpA= "";
         this.cvpB= "";
         this.cvpC= "";
         this.cvp= "";
         this.puan= "";
         this.zrlk= "";
     }
     
     public Soru(String soru,String cvpA,String cvpB,String cvpC,String cvp,String puan,String zrlk){
         this.soru=soru;
         this.cvpA=cvpA;
         this.cvpB=cvpB;
         this.cvpC=cvpC;
         this.cvp=cvp;
         this.puan=puan;
         this.zrlk=zrlk;
     }
     public String getSoru(){
         return soru;
     }
     public void setSoru(String soru){
         this.soru=soru;
     }
     public String getCvpA(){
         return cvpA;
     }
     public void setCvpA(String cvpA){
         this.cvpA=cvpA;
     }
     public String getCvpB(){
         return cvpB;
     }
     public void setCvpB(String cvpB){
         this.cvpB=cvpB;
     }
     public String getCvpC(){
         return cvpC;
     }
     public void setCvpC(String cvpC){
         this.cvpC=cvpC;
     }
     public String getCvp(){
         return cvp;
     }
     public void setCvp(String cvp){
         this.cvp=cvp;
     }
     public String getPuan(){
         return puan;
     }
     public void setPuan(String puan){
         this.puan=puan;
     }
     public String getZrlk(){
         return zrlk;
     }
     public void setZrlk(String zrlk){
         this.zrlk=zrlk;
     }
     
     @Override
     public String toString(){
         return "Soru [Metin="+ soru +", A="+ cvpA +", B="+ cvpB +", C="+ cvpC +", SoruPuanı="+ puan +"]";
         
    }
             




}



