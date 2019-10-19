import java.util.Scanner;
public class diskonnn {

    public static void main(String[] args) {

        diskon();


    }

    static int harga() {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan harga :");
        return scan.nextInt();
    }

    static int input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan jumlah baranf : ");
        return scan.nextInt();

    }
    static void  diskon () {
        int input2 = input();
        int harga2 = harga();
        double diskon = ((input2*harga2)-(0.1*input2*harga2));
        System.out.println(diskon);

    }

}