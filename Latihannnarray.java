
import java.util.Scanner;
public class Latihannnarray {
    public static void main(String[] args) {
        int [] b = new int [10];
        Scanner a = new Scanner(System.in);
        for (int i =1; i<b.length; i++){
            System.out.println("MASUKKAN ANGKA = "+i);
            b[i] = a.nextInt();
        }
        for (int i =1; i<b.length; i++){
            System.out.println("angka"+i+"="+b[i]);
        }
    }
}
