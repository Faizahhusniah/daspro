import java.util.Scanner;

public class MenampilkanArrayTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int maximal;
        int nilai [] ;
        int minimal;
        System.out.println("Masukkan jumlah angka yang ingin anda inputkan : ");
        angka = input.nextInt();
        nilai = new int [angka];
        for (int i =0; i<angka; i++){
            System.out.print("Masukkan Angka : ");
            nilai[i] = input.nextInt();
            maximal = nilai [0];
            minimal = nilai[0];
            for (int k=0; k<angka; k++){
                if (nilai[k] > maximal){
                    maximal = nilai[k];
                }
                else if (nilai[k] <minimal){
                    minimal = nilai[k];
                }
            }
            System.out.println("Nilai Terbesar : "+maximal);
            System.out.println("Nilai Terkecil : "+minimal);
        }
    }
}
