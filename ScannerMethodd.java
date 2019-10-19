import java.util.Scanner;
public class ScannerMethodd {
    public static void main(String[] args) {
        Scanner cak = new Scanner(System.in);
        int jumlah;
        System.out.println("|___________________________|");
        System.out.println("|Selamat Datang di MBA INDRI|");
        System.out.println("|---------------------------|");
        System.out.println("|Nama Barang  | Harga Barang|");
        System.out.println("|===========================|");
        System.out.println("|1.Beras       |  Rp.11000   |");
        System.out.println("|2.Gula        |  Rp.12000   |");
        System.out.println("|3.Minyak      |  Rp.6000    |");
        System.out.println("|4.Garam       |  Rp.3000    |");
        System.out.println("|5.Mentega     |  Rp.4000    |");
        System.out.println("|===========================|");

        System.out.println("Apa saja yang mau dibeli?");
         int pilihan = cak.nextInt();

        String namabarang2 = cak.nextLine();
        System.out.println("Berapa jumlahnya?");
         jumlah = cak.nextInt();
        int harga = 0; int hargaberas; int hargagula; int hargaminya; int hargagaram; int hargamenteg; int hargaawal;
        if (pilihan == 1) {
            harga = 11000;
            hargaberas=harga*jumlah;
            System.out.println(" harga awal BERAS Rp." + hargaberas);
        } else if (pilihan == 2) {
            harga = 12000;
            hargagula=harga*jumlah;
            System.out.println("harga awal Gula Rp." + hargagula);
        } else if (pilihan == 3) {
            harga = 6000;
            hargaminya = harga*jumlah;
            System.out.println("harga awal minyak Rp." + hargaminya);
        } else if (pilihan == 4) {
            harga=3000;
            hargagaram = harga*jumlah;
            System.out.println("harga awal garam Rp." + hargagaram);
        } else if (pilihan == 5) {
            harga=4000;
            hargamenteg = harga*jumlah;
            System.out.println("harga awal minyak RP" +hargamenteg);
        } else  {
            System.out.println("maaf barang yang anda cari tidak tersedia");

        }


    }



    }


