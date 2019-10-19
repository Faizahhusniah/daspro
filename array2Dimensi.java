public class array2Dimensi {
    public static void main(String[] args) {
        atribut y [] = new atribut[4];

        y[0] = new atribut(12);
        y[1] = new atribut(13);
        y[2] = new atribut(16);
        y[3] = new atribut(17);

        for (int i =0; i<y.length; i++){
            System.out.println("Luas X"+i+":"+y[i]);
        }
    }
}
