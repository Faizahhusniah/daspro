import java.util.Scanner;
public class Larik {
    public static void main(String[] args) {
        Scanner cak = new Scanner(System.in);
        float nilai [] = new float[5];
        System.out.println("Masukkan 5 buah data nilai");
        for (int i =0; i<5; i++){
            System.out.print((i+1)+": ");
            nilai [i] = cak.nextFloat();
        }
        System.out.println("Data nilai yang dimasukkan");
        for (int i =0; i<5; i++){
            System.out.println(nilai[i]);
        }

    }
}
