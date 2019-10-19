import java.util.Scanner;
public class operatorAritmatika {
    public static void main(String[] args) {
        int bill, bill2;
        float kali,bagi,mod, jumlah, kurang;
        Scanner fai = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1:");
        bill = fai.nextInt();
        System.out.println("Masukkan bilangan 2");
        bill2 = fai.nextInt();
        kali = bill * bill2;
        bagi = bill / bill2;
        mod = bill % bill2;
        kurang = (bill - bill2);
        jumlah = (bill + bill2);
        System.out.println("Hasil perkalian =" +kali);
        System.out.println("Hasil pembagian =" +bagi);
        System.out.println("Hasil Modulus =" +mod);
        System.out.println("Hasil Tambah =" +jumlah);
        System.out.println("Hasil Kurang =" +kurang);

    }
}
