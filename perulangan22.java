import java.util.Scanner;
public class perulangan22 {
    public static void main(String[] args) {
        Scanner fai = new Scanner(System.in);
        System.out.println("Masukkan angka tertentu");
        int a = fai.nextInt();
        int i =0;//inisialisasi batas dasar
        while (i<10) //kondisi pengulangan while
        {
            a=a+i;

            i++;//faktor pengulan increment
        }
        System.out.println(a);
    }
}
