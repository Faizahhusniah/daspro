import java.util.Arrays;
public class pengurutan {
    public static void main(String[] args) {
        int [] angka = {5,6,10,12,4,3};

        System.out.println("Array Sebelum Diurutkan : ");
        for (int i:angka){
            System.out.println(i);
        }
        System.out.println("");

        Arrays.sort(angka);

        System.out.println("Data array setelah diurutkan : ");
        for (int i : angka){
            System.out.println(i);
        }
    }
}
