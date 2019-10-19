import java.util.Arrays;
public class latihanprauas7 {
    public static void main(String[] args) {
        int [] angka = {5,6,7,8,9,10};

        System.out.println("Array sebelum diurutkan :");
        for (int i :angka){
            System.out.println(i);
        }
        System.out.println("");
        Arrays.sort(angka);

        System.out.println("Data setalah diurutkan ");
        for (int i : angka){
            System.out.println(i);
        }
    }
}
