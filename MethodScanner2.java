
import java.util.Scanner;
public class MethodScanner2 {
    public static void main(String[] args) {
pembuka();
        System.out.println("Apa yang mau dibeli?");
        String [] namabarang = new String[2];

    }
    static void pembuka () {
        System.out.println("|--------------------------------");
        System.out.println("|Selamat Datang di Toko Serbeguna|");
        System.out.println("|--------------------------------|");
        System.out.println("| Nama Barang | Harga Barang     |");
        System.out.println("|Beras        | Rp 110000,00     |");
        System.out.println("|Gula         | Rp 12000,00      |");
        System.out.println("|Minyak       | Rp 6000,00       |");
        System.out.println("|Garam        | Rp 3000,00       |");
        System.out.println("|Mentega      | Rp 4000,00       |");
        System.out.println("|--------------------------------|");

        System.out.println("Apa saja yang mau dibeli?");
        Scanner scan = new Scanner(System.in);
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
    }
