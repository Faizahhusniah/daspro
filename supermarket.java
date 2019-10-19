import java.util.Scanner;

public class supermarket {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("Masukkan jenis barang ");
        String Barang = b.next();
        System.out.println("masukkan jumlah barang ");
        int jumlahbarang = b.nextInt();
        switch (Barang) {
            case "coklat":
                System.out.println(4000*jumlahbarang);
                break;
            case "susu":
                System.out.println(10000*jumlahbarang);
                break;
            case "indomilk":
                    System.out.println(12000*jumlahbarang);
                    break;
            case "minyakkayuputih":
                System.out.println();

        }


    }

}