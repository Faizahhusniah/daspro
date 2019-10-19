import java.util.Scanner;
public class Suhu {
    public static void main(String[] args) {
        Scanner suhu = new Scanner(System.in);
        int celcius;
        float reamur, kelvin, fahrenheit;
        System.out.println("Masukkan Derajat Celcius:");
        celcius = suhu.nextInt();
        reamur = 4f/5f * celcius;
        fahrenheit = 9f/5f * celcius + 32;
        kelvin = celcius + 273;
        System.out.println("Reamur:"+reamur);
        System.out.println("Kelvin:"+kelvin);
        System.out.println("Fahrenheit:"+fahrenheit);


    }
}
