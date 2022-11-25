import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınıcak sayıyı giriniz: ");
        a = scan.nextInt();
        System.out.print("Üs alacak sayıyı giriniz : ");
        b = scan.nextInt();

        int total = 1;
        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println("Cevap : " + total);
    }
}