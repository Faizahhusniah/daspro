import java.util.Scanner;
public class perulangan3 {
    public static void main(String[] args) {
        Scanner fai = new Scanner(System.in);
        System.out.println("Masukkan Perulangan");
        int looping = fai.nextInt();
        int i = 0;
        int a;
        for(a=1; a<=looping; a++){
            i = i+a;
        }
        System.out.println("Jumlah="+i);
    }
}
