import java.util.Scanner;

public class produkk {
    public static void main(String[] args) {
    barang();

    }

    public static void barang() {
        int hargaterigu = 13000;
        int hargasabun = 14000;
        int harganasi = 24500;
        int hargasarden = 24500;
        int harganuget = 39500;
        int hargadeterjen = 16000;
        int hargapasta = 14000;
        Scanner prod = new Scanner(System.in);
        System.out.println("masukkan nama produk :");
        String produk = prod.next();
        switch (produk) {
            case "Tepung Terigu XYZ":
                System.out.println("jenis: Bahan makanan");
                System.out.println(" ukuran : 500gr");
                System.out.println(hargaterigu);
                break;
            case "Sarden":
                System.out.println("jenis : rumah tangga");
                System.out.println("ukuran : 400 ml");
                System.out.println(hargasarden);
            case "Bumbu nasi goreng":
                System.out.println("jenis : bahan makanan");
                System.out.println("ukuran : 600gr");
                System.out.println(harganasi);
            case "nugget XYZ":
                System.out.println("jenis : bahan makanan");
                System.out.println("ukuran : 120gr ");
                System.out.println(harganuget);
            case "detergen xyz":
                System.out.println("jenis : rumah tangga ");
                System.out.println("ukuran 350 ml");
                System.out.println(hargadeterjen);
            case "pastagigi ":
                System.out.println("jenis : rumah tangga");
                System.out.println("ukuran 350 ml");
                System.out.println(hargapasta);
        }

    }
}
