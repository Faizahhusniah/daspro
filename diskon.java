import java.io.IOException;
import java.util.Scanner;
public class diskon {


    public static void main(String[] args) throws IOException {
        Scanner cak = new Scanner(System.in);
        //deklarasikan variabel dan tipe datanya
        double belanja = 0.0;
        double disc = 0;
        double bayar = 0.0;
        //bagian utama program
        System.out.println("Masukkan jumlah belanja anda : ");
        belanja = cak.nextInt();
        //PROSES HITUNG DISKON
        if (belanja >= 100000) {
            disc = belanja * 0.07;
        } else if
            (belanja >= 50000){
            disc = belanja * 0.03;
        }
             else{
            disc = 0;
        }


        //proses hitung total bayar
        bayar = belanja - disc;
        //cetak belanja, diskom ,dan total bayar
        System.out.println("total belannja anda : Rp " + belanja);
        System.out.println("Diskon belanja anda : Rp " + disc);
        System.out.println("Total bayar anda : Rp " + bayar);
    }
}
