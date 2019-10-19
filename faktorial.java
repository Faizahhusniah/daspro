import java.util.Scanner;
public class faktorial {
    public static void main(String[] args) {
        long faktorial = 1;
        Scanner fai = new Scanner(System.in);
        int looping = fai.nextInt();
        fai.close();
        int i = 0;
        for (i = 1; i <= looping; i++) {
            faktorial = faktorial * i;
        }
        System.out.println(faktorial);
    }
}