import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik;
        //Geçerli girişlerde belirlenecek int değerleri
        int toplam = 0, sayac = 0;

        Scanner input = new Scanner(System.in);
        //Der notu giriş başlangıcı
        System.out.print("Matematik Ders notunuz: ");
        mat = input.nextDouble();
        //100'den yukarı değerlerde
        if (mat >= 0 && mat <= 100) {

            toplam += mat;
            sayac++;
        } else {
            System.out.println(" Lütfen Geçerli Bir Not Giriniz!");
        }
        System.out.print("Fizik Ders notunuz: ");
        fizik = input.nextDouble();

        if (fizik >= 0 && fizik <= 100) {

            toplam += fizik;
            sayac++;
        } else {
            System.out.println(" Lütfen Geçerli Bir Not Giriniz!");
        }
        System.out.print("Türkçe Ders notunuz: ");
        turkce = input.nextDouble();

        if (turkce >= 0 && turkce <= 100) {

            toplam += turkce;
            sayac++;
        } else {
            System.out.println(" Lütfen Geçerli Bir Not Giriniz!");
        }
        System.out.print("Kimya Ders notunuz: ");
        kimya = input.nextDouble();

        if (kimya >= 0 && kimya <= 100) {

            toplam += kimya;
            sayac++;
        } else {
            System.out.println(" Lütfen Geçerli Bir Not Giriniz!");
        }
        System.out.print("Müzik Ders notunuz: ");
        muzik = input.nextDouble();

        if (muzik >= 0 && muzik <= 100) {

            toplam += muzik;
            sayac++;
        } else {
            System.out.println(" Lütfen Geçerli Bir Not Giriniz!");
        }
        //GSonuç durumu
        String durum = "";

        double avarage = (toplam) / sayac;
        //Geçme-Kalma koşul durumu
        durum = avarage >= 60 ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println(durum);

        System.out.println("Ortalamanız: " + avarage);

    }
}