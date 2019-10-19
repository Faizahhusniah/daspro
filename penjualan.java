import java.util.Scanner;
public class penjualan {
    public static void main(String[] args) {
        //deklarasi integer
        int jlh_data,pilihan,total,bayar,kembalian,harga=0;
        String namamakanan;
        Scanner input = new Scanner(System.in);
        //mencetak nilai dari objek
        System.out.println(" ______________________");
        System.out.println("|   Menu Makanan       |");
        System.out.println("|----------------------|");
        System.out.println("|1.Mie Ayam Mas Gugun  |");
        System.out.println("|2.Mie Aceh Mba Faizah |");
        System.out.println("|3.Bakso bang ojik     |");
        System.out.println("-----------------------");

        System.out.println("Silahkan pilih yang ingin anda pesan :");
        pilihan = input.nextInt();
        if(pilihan==1){
            harga=10000;
            System.out.println("Mie ayam mas gugun Rp. "+harga);
        } else if (pilihan==2){
            harga=12000;
            System.out.println("Mie ayam mba faizah Rp. "+harga);

        } else if(pilihan==3){
            harga=15000;
            System.out.println("Bakso bang ojik Rp. "+harga);
        } else {
            System.out.println("maaf pilihan yang anda pilih salahhh !");
        }
        System.out.println("Jumlah Porsi ?");
        jlh_data=input.nextInt();
        //melakukan proses penghitungan total harga
        total=harga*jlh_data;
        System.out.println("Anda harus membayar Rp."+total);
        System.out.println("jumlah uang yang anda bayarkan ");
        bayar = input.nextInt();
        kembalian= (int)(bayar-total);
        System.out.println("Kembaliannya : Rp. "+kembalian);

        return;
    }
}
