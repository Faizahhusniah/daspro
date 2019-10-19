import java.util.Scanner;
public class methodscanner {
    public static void main(String[] args) {
        double sisibawah = input("Sisi Bawah");
        double sisiatas = input("Sisi Atas");
        double tinggi = input("tinggi");
        double luas = (sisiatas+sisibawah) * tinggi/2;
        System.out.println("Luas "+luas );
    }
public static double input (String pesan){
    Scanner sc = new Scanner(System.in);
    System.out.print(pesan + ": ");
    return sc.nextDouble();
}


}
