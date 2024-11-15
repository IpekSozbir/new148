package P02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        int a = 128;
        int b = 17;
        System.out.println("c=" + (a+b));

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println("girdiğiniz sayi bir cift sayidir");
        } else {
            System.out.println("girdiğiniz sayi bir cift sayi degildir");
        }
    }
}
