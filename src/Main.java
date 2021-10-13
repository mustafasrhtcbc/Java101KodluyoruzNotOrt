import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int fizik,kimya,turkce,mat,resim;
        Scanner imp=new Scanner(System.in);
        
        System.out.print("Fizik dersi sınav notunuzu giriniz:");
        fizik=imp.nextInt();
        System.out.print("Kimya dersisınav notunuzu giriniz:");
        kimya=imp.nextInt();
        System.out.print("Türkçe dersi sınav notunuzu giriniz:");
        turkce=imp.nextInt();
        System.out.print("Matematik dersi sınav notunuzu giriniz:");
        mat=imp.nextInt();
        System.out.print("Resim dersi sınav notunuzu giriniz:");
        resim=imp.nextInt();

        double ort=(fizik+kimya+turkce+mat+resim)/5;

        String sonuc= ort>=60 ? "geçtiniz" : "kaldınız";
        System.out.println("Ortalamanız:"+ort);
        System.out.println("Dersleri Geçme durumunuz:  "+sonuc);
        imp.close();










        
    }
}
