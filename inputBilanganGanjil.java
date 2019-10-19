import java.util.Scanner;
public class inputBilanganGanjil {
    public static void main(String[] args) {
        Scanner ganjil = new Scanner(System.in);
        System.out.println("Masukkan jumlah n");
        int n;
        n = ganjil.nextInt();
        for (int x = 1; x <= n; ) {
            if (x % 2 == 1) {
                System.out.println(x);

            }
            x++;
        }
    }
}
