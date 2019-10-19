public class methodLingkaran {
   //fungsi hitung luas
    public static double luaslingkaran(int r) {
        return 3.14*r*r;
    }
    //fungsi hitung keliling
    public static double kelilinglingkaran(int r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        // tentukan nilai panjang dan lebar
        int jari2= 14;
        System.out.println("Luas lingkaran:"+luaslingkaran(jari2));
        System.out.println("Keliling lingkaran:"+kelilinglingkaran(jari2));
    }



}
