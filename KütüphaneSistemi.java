
package kütüphanesistemi;
import java.util.ArrayList;
public class KütüphaneSistemi {
    public static void main(String[] args) {
   ArrayList<Kitap> kitaplar = new ArrayList <> ();
   Kitap kitap1 = new Kitap ("Kardeşimin hikayesi ", 250 ," Zülfi Livaneli ", 2010) ;
   Roman roman1 = new Roman ("Tutunamayanlar ", 450 , " Sait faik abasıyanık ", 2001 , 1 ) ;
   Hikaye hikaye1 = new Hikaye ("Yalnız Efe ", 120 , " Ömer Seyfettin " , 1995 , " mücadele ") ;
   Kitap hikaye2= new Hikaye () ;
   Kitap roman2 = new Hikaye () ;
   System.out.println ("Kitap adı = " +hikaye1.getkitapAdi()) ;
   kitapYazdir(hikaye1) ;
   kitapYazdir (roman1) ;
   roman1.setyazar("oğuz Atay");
   kitapYazdir(roman1) ;
   kitapYazdir (kitap1) ;
   kitapYazdir (roman2) ;
   kitaplar.add(kitap1);
   kitaplar.add(roman1);
   kitaplar.add(hikaye1);  //Kitap ekler 
   kitaplar.remove (kitap1);  //Kitap siler
   kitaplar.add(hikaye2) ;
   kitaplar.add (roman2) ;
   System.out.println (kitaplar.size()) ;  //Kaç tane kitap olduğunu gösterir.
   kitap1.toString();
   roman2.toString();
   kitap1.kitapOku();
   hikaye1.kitabiSeslendir();
   hikaye2.toString() ;
   roman1.kitapOku();   }
private static void kitapYazdir (Kitap kitap) {
    kitap.kitapYazdir () ; }  //Polymorphism örneği
}  
class Kitap {
private String kitapAdi ;
private int sayfaSayisi ;  //kapsülleme
private String yazar ;
private int basimYili ;
public Kitap () {  //contractur (yapıcı) metoda varsayılan değerin atanması
    this.kitapAdi = "Kitap adı henüz atanmadı." ;
    this.basimYili = 0 ;
    this.sayfaSayisi = 0;
    this.yazar = " Yazar henüz atanmadı. " ; }
public Kitap (String kitapAdi, int sayfaSayisi, String yazar, int basimYili ) { //yapıcı metod
    this.sayfaSayisi=sayfaSayisi ;
    this.yazar=yazar ;
    this.basimYili=basimYili ;
    this.kitapAdi=kitapAdi ;   }
public String getkitapAdi () {   
    return kitapAdi ; }
public void setkitapAdi (String kitapAdi) {
    this.kitapAdi =kitapAdi ; }
public int getsayfaSayisi () {
    return sayfaSayisi ; }
public void setsayfaSayisi (int sayfaSayisi) {
    this.sayfaSayisi = sayfaSayisi ; }
public String getyazar () {
    return yazar ; }
public void setyazar (String yazar) {
    this.yazar =yazar ; }
public int getbasimYili () {
    return basimYili ; }
public void setbasimYili (int basimYili) {
    this.basimYili=basimYili ; }
public void kitapYazdir () {
    System.out.println (kitapAdi +"kitabı " + sayfaSayisi +" sayfalı " + basimYili + " yılında basılmış " + yazar + " 'in kitabıdır.") ; }
public void kitapOku () {
    System.out.println ("Kitap seslendiriliyor...") ;  }
@Override
    public String toString () {
    return "Kitabın adı = " +getkitapAdi ()  ; }
}
class Roman extends Kitap {  //kalıtım (miraslama)
    private int ciltSayisi ;
    public int getciltSayisi () {
    return ciltSayisi ; }
    public void setciltSayisi (int ciltSayisi) {
    this.ciltSayisi=ciltSayisi ; }
    public Roman () {
    }
    public Roman (String kitapAdi, int sayfaSayisi, String yazar, int basimYili,int ciltSayisi) { 
     super (kitapAdi, sayfaSayisi, yazar, basimYili) ;
     this.ciltSayisi =ciltSayisi ;  }
    @Override
    public void kitapYazdir () { //metod
    System.out.println (getkitapAdi() + " kitabı" + getsayfaSayisi()+" sayfalı" + getbasimYili()+ " yılında basılmış" +ciltSayisi+" ciltli"+ getyazar()+" 'ın kitabıdır.") ; }       
    @Override
    public String toString () {  
    return "roman türündeki kitabın adı = " +getkitapAdi ()  ; }
    }
class Hikaye extends Kitap {
    private String konu ;
    public String getkonu () {
    return konu ; }
    public void setkonu (String konu) {
    this.konu = konu ; }
    public Hikaye () {
     }
    public Hikaye (String kitapAdi, int sayfaSayisi, String yazar, int basimYili,String konu) { 
    super (kitapAdi, sayfaSayisi, yazar, basimYili) ;
    this.konu = konu  ;  }
    public void kitabiSeslendir () {
        System.out.println ("Hikaye seslendiriliyor.") ;
    }
    @Override
    public void kitapYazdir () {
    System.out.println (getkitapAdi() + " kitabı" + getsayfaSayisi()+" sayfalı" + getbasimYili()+ " yılında basılmış" + konu + "konulu "+ getyazar()+" 'in kitabıdır.") ; }       
    @Override
    public String toString () {
    return "hikaye türündeki kitabın adı = " +getkitapAdi ()  ; }

    }
    

