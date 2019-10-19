public class ArrayPakAffandes {
    public static void main(String[] args) {
        int x [] = {5,6,7};
        int w [] = {5,6,7};
        int y [] = {5,6,7};
        int z [] = {5,6,7};

        int angka [] [] = new int [4][3];
        angka [0] = x;
        angka [1] = y;
        angka [2] = w;
        angka [3] = z;

        for (int i =0; i<angka.length; i++){
            for (int j=0; j<angka[i].length; j++){
                System.out.print(angka[i][j] + ",");
            }
            System.out.println();
        }

    }
}
