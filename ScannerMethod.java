import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("|--------------------------------|");
        System.out.println("|Selamat datang di toko serbaguna|");
        System.out.println("|--------------------------------|");
        System.out.println("|Nama Barang | Harga Barang      |");
        System.out.println("|------------|-------------------|");
        System.out.println("|Beras       | Rp 11.0000,00     |");
        System.out.println("|Gula        | Rp.12.000,00      |");
        System.out.println("|Minyak      | Rp 6.000,00       |");
        System.out.println("|Garem       | Rp 3000,00        |");
        System.out.println("|Mentega     | Rp 4000,00        |");
        System.out.println("|--------------------------------|");

        System.out.println("Apa saja yang mau dibeli?");
        String namabarang = scan.nextLine();
        String namabarang2 = scan.nextLine();
        int harga = 0;
        switch (namabarang) {
            case "Beras":
            harga = 11000; break;
            case "Gula":
            harga = 12000; break;
            case "Minyak":
            harga = 6000; break;
            case "Garam":
            harga = 3000; break;
            case "Mentega":
            harga = 4000; break;
            default:
                break;
        }
        return;
    }
    static int total (int harga1, int harga2){
        return harga1 + harga2;
    }
    static int input2() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    static int kembalian (int jumlahuang, int total){
        int kembalian = jumlahuang-total;
        System.out.println("Kembalian uang anda= "+kembalian);
        return kembalian;
    }
}
