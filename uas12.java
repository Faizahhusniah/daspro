import java.util.Scanner;
public class uas12 {
    public static void main(String[] args) {
        jumlah(23);



    }

    public static void jumlah(int a) {
        Scanner x = new Scanner(System.in);
        System.out.println("masukkan jumlah :");
        a = x.nextInt();


        if (a > 3) {
            System.out.println((a * 10000) - ((a * 10000) * 10 / 100));
        }
        else {
            System.out.println(a*10000);
        }

    }
}