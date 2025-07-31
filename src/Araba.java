
import java.util.Scanner;

public class Araba { // araba adında bir sınıf   class oluşturuldu
    public static void main(String[] args) {


        // Değişkenler Tanımlandı
        int id;
        String marka;
        String model;
        int yil;
        double fiyat; // küsüratlı rakam çıkabilir o sebeple veri tipi double

        String[] araba = {"Tofaş", "BMW", "Mercedes", "Şahin", "Skoda", "Clio"}; // string tipinde araba dizi oluşturuldu

        Scanner scanner = new Scanner(System.in);

       System.out.print("Seçim Giriniz:");

        int secim = scanner.nextInt(); // seçim değişkenini girebilmek için scanner.nextInt () kullanıyoruz
                                        // int tipinde girdiğim sayıyı sayııy secime atadım ve secim değerimi switch ekledim

        switch (secim) {

            case 1:
                System.out.println("Tüm Arabaları Listele");
                break;

            case 2:
                System.out.println("Fiyata Göre Filtrele");
                break;

            case 3:
                System.out.println("Markaya Göre Ara");
                break;

            case 4:
                System.out.println("Çıkış");
        }

    }
}
