

import java.util.Scanner;
public class latiahannnn {
    public static void main(String[] args) {
        int [] b = new int[10];
        Scanner a = new Scanner(System.in);
        for (int i =1; i<b.length; i++){
            System.out.println("Masukkan Angka "+i);
            b[i] = a.nextInt();
        }
        for (int i =1; i<b.length; i++){
            System.out.println("Angka "+i+"="+b[i]);
        }
    }
}
