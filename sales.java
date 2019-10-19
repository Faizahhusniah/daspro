import java.util.Scanner;
public class sales {
    public static void main(String[] args) {
        Scanner ji = new Scanner(System.in);
        System.out.println("MASUKKAN JUMLAH BARANG:");
        int jumlah = ji.nextInt();
        System.out.println("MASUKKAN HARGA BARANG");
        int harga = ji.nextInt();

        while (jumlah != 0 || harga != 0) {
            System.out.println("Masukkan jumlah barang:");
            jumlah = ji.nextInt();
            System.out.println("masukkan harga barang:");
            harga = ji.nextInt();
        }
        System.out.println("Inputan Berakhhir");
    }
}