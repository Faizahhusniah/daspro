import java.util.Scanner;
public class UlangWhile4 {
    public static void main(String[] args) {
        Scanner suhu = new Scanner(System.in);
        int bill;
        float c,f;
        char lagi;
        String input;
        lagi = 'Y';
                while (lagi == 'Y') {
                    System.out.println("Fahrenheit:");
                    f = suhu.nextFloat();
                    c=5f/9f * f - 32f;
                    System.out.println("Celcius:"+c);
                    System.out.println("Menghitung lagi?(Y/T)");
                    input = suhu.next();
                    lagi = input.charAt(0);

                }
if (lagi =='T') {
            System.out.println("Baiklah terimakasih");
        }
    }
}
