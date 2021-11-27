import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int tahmin = 0;
        int deneme= 0;

        sayi = (int)(Math.random()*9) + 1;

        do {
            System.out.println("Tahmininizi Giriniz:");
            tahmin = scan.nextInt();
            deneme++;
            if (tahmin>sayi){
                System.out.println("Daha küçük bir sayı giriniz.");
            }
            if (tahmin<sayi){
                System.out.println("Daha büyük bir sayı giriniz.");
            }
        }while (tahmin!=sayi);

        System.out.println("Doğru bildiniz: " + sayi);
        System.out.println(deneme + " kadar deneme yaptınız.");
    }
}
