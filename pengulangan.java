import java.util.Scanner;
public class pengulangan {
    public static void main(String[] args) {
        Scanner cai = new Scanner(System.in);
        int looping = cai.nextInt();
        cai.close();
        int i =0;
        double jml=0;
        for (i=1; i<= looping; i++) {
          jml = jml+i;
        }
        double total = jml/looping;
        System.out.println("jumlah"+jml);

        System.out.println("Ratarata="+total);
    }
}
