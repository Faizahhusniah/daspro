public class forrr {
    public static void main(String[] args) {
        bintang (10);
    }

    public static void bintang(int a) {
        for (int  i=0; i<=a; i++){
            System.out.println();
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
        }

    }
}

