import java.util.Scanner;
public class scannerPangkat {
    public static void main(String[] args) {
        Scanner pangkat = new Scanner(System.in);
        System.out.println("Masukkan nilai x:");
        int x = pangkat.nextInt();
        System.out.println("Masukkan nilai y:");
        int y = pangkat.nextInt();
        double hasil = Math.pow(x,y);
        System.out.println(x+"^"+y+"="+hasil);

    }
}
