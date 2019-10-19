import java.util.Scanner;
public class programTebakAngka {
    public static void main(String[] args) {
        Scanner fai = new Scanner(System.in);
        int random, tebak;
        random = (int) ( Math.random()*20);
        int kesempatan = 2;
        System.out.println("Tebaklah Angka-angka dengan 3x kesempatan");


        do {
            System.out.println("Masukkan Tebakan");
            tebak = fai.nextInt();
            if (kesempatan > 0) {
                if (tebak < random) {
                    System.out.println("Maaf, angka yang anda masukkan terlalu kecil");}
                    else if ( tebak > random) {
                    System.out.println("Maaf angka yang anda masukkan terlalu besar");}
                System.out.println("Anda memiliki "+kesempatan+"kesempatan lagi");
                System.out.println("----------------------------------------------");
                kesempatan--;}
                else  {
                System.out.println("---------------------------------------------");
                System.out.println("ANDA SALAH!! KESEMPATAN HABIS.SILAHKAN COBA LAGI");
                System.out.println("ANGKA YANG DIMAKSUD ADALAH"+random);
                System.out.println("----------------------------------------------");
                break;
                }
            }
            while (kesempatan >= 0);
        }
        }



