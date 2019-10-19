import java.util.Scanner;
public class TanggalKadaluarasaMakanan {
    public static void main(String[] args) {
        Scanner makanan = new Scanner (System.in);
        System.out.println("Masukkan Kode Barang=");
        String kodeBarang = makanan.nextLine();
        System.out.println("Masukkan nama Barang=");
        String namaBarang = makanan.nextLine();
        System.out.println("Masukkan tanggal beli=");
        String tanggalBeli = makanan.nextLine();
        String [] pemisah = tanggalBeli.split("-");

        int tanggal = Integer.parseInt(pemisah[0]);
        int bulan = Integer.parseInt(pemisah[1]);
        int tahun = Integer.parseInt(pemisah[2]);

        int tanggalExp = tanggal;
        int bulanExp = bulan+2;
        int tahunExp = tahun+1;


        String TanggalExp = tanggalExp+"-"+bulanExp+"-"+tahunExp;

        System.out.println("Kode Barang="+kodeBarang);
        System.out.println("Nama Barang="+namaBarang);
        System.out.println("Tanggal Beli="+tanggalBeli);
        System.out.println("Tanggal Expired ="+TanggalExp);


    }

}

