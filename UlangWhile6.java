import java.util.Scanner;
public class UlangWhile6 {
    public static void main(String[] args) {
        Scanner fai = new Scanner(System.in);
        int i = 1;
        float n, jum, x, rata;
        System.out.println("Banyaknya Data ");
        n = fai.nextFloat();
        jum=0;
        while (i<=n) {
            System.out.println("Data ke-" + i + ":");
            x = fai.nextFloat();
            jum += x;
            i++;
        }
        rata = jum/n;
        System.out.println("Rata-rata:"+rata);
        System.out.println("Jumlah:"+jum);
        }
    }

