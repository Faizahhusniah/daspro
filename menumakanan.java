import  javax.swing.JOptionPane;
import java.util.Scanner;
public class menumakanan {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"                                 SELAMAT DATANG DI \n" +
                "*=*=*=*=PONDOK Nasi Goreng & Ayam Goreng KELAS A=*=*=*=*");
        int i=1;
        int menu;
        do{
            System.out.print("Silahkan pilih menunya: \n"
                    + "1. Paket 1 = Nasi + Ayam Goreng + Es Teh Manis = Rp7000 \n"
                    + "2. Paket 2 = Nasi + Ayam Goreng + Lalapan & Sambal + Es Teh manis = Rp9000 \n"
                    + "3. Paket 3 = Nasi + Ayam Bakar + Es Teh Manis = Rp8000 \n"
                    + "4. Paket 4 = Nasi Goreng + Es Teh Manis = Rp10000 \n"
                    + "5. Paket 5 = Kwetiau + Es Teh Manis = Rp10000 \n"
                    + "-------------------------------------------------------------------------------- \n"
                    + "6. Exit Program \n"
                    + "-------------------------------------------------------------------------------- \n"
                    + "Memilih Menu : ");
            Scanner input1 = new Scanner(System.in);
            menu = input1.nextInt();
            switch(menu){
                case 1:
                    System.out.println("-------------------------------------------------------------------------------- \n"
                            + "Paket 1 = Nasi + Ayam Goreng + Es Teh Manis");
                    System.out.println("Harga: Rp7000");
                    System.out.print("Berapa jumlah paket yang akan Anda beli? \n"
                            + "Jumlah Paket = ");
                    int quant1;
                    Scanner quantity1 = new Scanner(System.in);
                    quant1 = quantity1.nextInt();
                    int a;
                    a = quant1*7000;
                    System.out.println("Total harga = Rp"+a);
                    System.out.print("Silahkan masukkan nominal uang yang dibayarkan = Rp");
                    int uang1;
                    Scanner input2 = new Scanner(System.in);
                    uang1 = input2.nextInt();
                    int jujule1;
                    jujule1 = uang1-a;
                    System.out.println("Kembali = Rp"+jujule1);
                    System.out.println("--------------------------------------------------------------------------------");
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGANNYA :)");
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MENUNYA JIKA ANDA INGIN MEMESAN KEMBALI.");
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------------------------------- \n"
                            + "Paket 2 = Nasi + Ayam Goreng + Lalapan & Sambal + Es Teh manis");
                    System.out.println("Harga: Rp9000");
                    System.out.print("Berapa jumlah paket yang akan Anda beli? \n"
                            + "Jumlah Paket = ");
                    int quant2;
                    Scanner quantity2 = new Scanner(System.in);
                    quant2 = quantity2.nextInt();
                    int b;
                    b = quant2*9000;
                    System.out.println("Total harga = Rp"+b);
                    System.out.print("Silahkan masukkan nominal uang yang dibayarkan = Rp");
                    int uang2;
                    Scanner input3 = new Scanner(System.in);
                    uang2 = input3.nextInt();
                    int jujule2;
                    jujule2 = uang2-b;
                    System.out.println("Kembali = Rp"+jujule2);
                    System.out.println("--------------------------------------------------------------------------------");
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGANNYA :)");
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MENUNYA JIKA ANDA INGIN MEMESAN KEMBALI.");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------- \n"
                            + "Paket 3 = Nasi + Ayam Bakar + Es Teh Manis");
                    System.out.println("Harga: Rp8000");
                    System.out.print("Berapa jumlah paket yang akan Anda beli? \n"
                            + "Jumlah Paket = ");
                    int quant3;
                    Scanner quantity3 = new Scanner(System.in);
                    quant3 = quantity3.nextInt();
                    int c;
                    c = quant3*8000;
                    System.out.println("Total harga = Rp"+c);
                    System.out.print("Silahkan masukkan nominal uang yang dibayarkan = Rp");
                    int uang3;
                    Scanner input4 = new Scanner(System.in);
                    uang3 = input4.nextInt();
                    int jujule3;
                    jujule3 = uang3-c;
                    System.out.println("Kembali = Rp"+jujule3);
                    System.out.println("--------------------------------------------------------------------------------");
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGANNYA :)");
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MENUNYA JIKA ANDA INGIN MEMESAN KEMBALI.");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------------------------------- \n"
                            + "Paket 4 = Nasi Goreng + Es Teh Manis");
                    System.out.println("Harga: Rp10000");
                    System.out.print("Berapa jumlah paket yang akan Anda beli? \n"
                            + "Jumlah Paket = ");
                    int quant4;
                    Scanner quantity4 = new Scanner(System.in);
                    quant4 = quantity4.nextInt();
                    int d;
                    d = quant4*10000;
                    System.out.println("Total harga = Rp"+d);
                    System.out.print("Silahkan masukkan nominal uang yang dibayarkan: Rp");
                    int uang4;
                    Scanner input5 = new Scanner(System.in);
                    uang4 = input5.nextInt();
                    int jujule4;
                    jujule4 = uang4-d;
                    System.out.println("Kembali = Rp"+jujule4);
                    System.out.println("--------------------------------------------------------------------------------");
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGANNYA :)");
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MENUNYA JIKA ANDA INGIN MEMESAN KEMBALI.");
                    break;
                case 5:
                    System.out.println("-------------------------------------------------------------------------------- \n"
                            + "Paket 5 = Kwetiau + Es Teh Manis");
                    System.out.println("Harga: Rp10000");
                    System.out.print("Berapa jumlah paket yang akan Anda beli? \n"
                            + "Jumlah Paket = ");
                    int quant5;
                    Scanner quantity5 = new Scanner(System.in);
                    quant5 = quantity5.nextInt();
                    int e;
                    e = quant5*10000;
                    System.out.println("Total harga = Rp"+e);
                    System.out.print("Silahkan masukkan nominal uang yang dibayarkan: Rp");
                    int uang5;
                    Scanner input6 = new Scanner(System.in);
                    uang5 = input6.nextInt();
                    int jujule5;
                    jujule5 = uang5-e;
                    System.out.println("Kembali = Rp"+jujule5);
                    System.out.println("--------------------------------------------------------------------------------");
                    JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS KUNJUNGANNYA :)");
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MENUNYA JIKA ANDA INGIN MEMESAN KEMBALI.");
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "TIDAK ADA DALAM MENU !!.");
            }
            i++;
        }while(i < 7);
    }
}
