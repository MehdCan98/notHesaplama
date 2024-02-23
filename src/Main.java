import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scannner sınıfını projeye dahil ettik.

public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımladık
        int mat, fizik, turkce, kimya, muzik, toplam;


        Scanner input = new Scanner(System.in);


        //Kullanıcıdan verileri aldık
        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();


        //Kullanıcının girdiği notların 0-100 aralığında olup olmadıpını if else yapısıyla kontrol ettik.
        if ((mat >=0) && (mat <=100)) {
            System.out.println("Fizik Notunuz: ");
            fizik = input.nextInt();
        }
        else {
            System.out.println("Girdiğiniz Not geçersizdir");
            return;
        }
        if ((fizik >=0) && (fizik <=100)){
            System.out.println("Türkçe Notunuz: ");
            turkce = input.nextInt();
        }
        else {
            System.out.println("Girdiğiniz Not geçersizdir");
            return;
        }
        if ((turkce >=0) && (turkce <=100)){
            System.out.println("Kimya Notunuz: ");
            kimya = input.nextInt();
        }
        else {
            System.out.println("Girdiğiniz Not geçersizdir");
            return;
        }
        if ((kimya >=0) && (kimya <=100)){
            System.out.println("Müzik Notunuz: ");
            muzik = input.nextInt();
        }

        else {
            System.out.println("Girdiğiniz Not Geçersizdir");
            return;
        }


        //Not toplamlarını ders sayısına bölerek çıkan sonuca 55 olan geçme notunu baz alarak kullanıcıya sonucu yazdık
        if ((muzik >=0) && (muzik <=100)){
            toplam =(mat+fizik+turkce+kimya+muzik)/5;
            if (toplam>=55){
                System.out.println("Sınıfı Geçtiniz");
            }
            else {
                System.out.println("Sınıfta Kaldınız");
            }
            System.out.println("Ortalama Notunuz: "+ toplam);
        }



    }
}