import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y,secim;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        y = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiminiz:");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam =" +(x+y));
                break;
            case 2:
                System.out.println("Çıkarma=" +(x-y));
                break;
            case 3:
                System.out.println("Çarpım =" +(x*y));
                break;
            case 4:
                if(y != 0)
                System.out.println("Bölüm =" +(x/y));
                else
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:
                System.out.println("Yanlış seçim girdiniz.Tekrar deneyiniz..");
        }

    }
}
