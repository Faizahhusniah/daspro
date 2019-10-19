import java.util.Scanner;
public class perpustakaan {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);
        System.out.println("|---------------------------------");
        System.out.println("|Selamat Datang di Perpustakaan TIF|");
        System.out.println("|---------------------------------|");
        System.out.println("| KODE BUKU   | nama buku         |");
        System.out.println("|011          | ALJABAR LINEAR    |");
        System.out.println("|012          | KALKULUS          |");
        System.out.println("|013          | ALGORITMA         |");
        System.out.println("|014          | MATEMATIKA DISKRIT|");
        System.out.println("|015          | PEMROGRAMAN       |");
        System.out.println("|---------------------------------|");
        System.out.println("silahkan masukkan kode buku");
 kode();

    }
    public static void kode () {
        Scanner book = new Scanner(System.in);
        int kodebuku = book.nextInt();
        if (kodebuku==011){
            System.out.println("BUKU YANG ANDA CARI DI LT 1");
        } else if (kodebuku==012){
            System.out.println("Buku yang anda cari di lt 2");
        } else if (kodebuku==013){
            System.out.println("buku yang anda cari di lt 3");
        } else if (kodebuku ==014){
            System.out.println("buku yang anda cari di lt 5");
        } else if (kodebuku==015){
            System.out.println("buku yang anda cari di lt 4");
        } else {
            System.out.println("maaf kode yang dimasukkan tidak valid");
        }
    }
}
