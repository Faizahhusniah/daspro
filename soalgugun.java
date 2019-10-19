
public class soalgugun {
    public static void main(String[] args) {
        int[] angka = {1, 4, 2, 10, 2, 8};
        for (int x = 0; x < angka.length - 1; x++) {
            for (int i = 0; i < angka.length - 1 - x; i++) {
                if (angka[i] > angka[i + 1]) {
                    int temp = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = temp;
                }

            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ",");

        }
        System.out.println("");
        for (int i = 1; i < angka.length; i++) {
            if (angka[i]==10){
                System.out.println(angka[i]+"berada pada indeks ke "+i);
            }


        }
        System.out.println("jumlah indeks ada "+angka.length);

    }
}