public class rekening {
    public static double luas(double p, double l) {
        return p * l;
    }

    public static void main(String[] args) {
        cetak("faizah");


    }

    public static String cetak (String Test) {
    int a = Test.length();
    a--;
    if(a<0){
        return Test;

} else {
        System.out.println(Test.substring(0,a+1));
        cetak(Test.substring(0,a));
    }
    return Test;



        }


    }


