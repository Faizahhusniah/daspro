public class BelajarArray {
    public static void main(String[] args) {
        int[][] x = new int[5][4];
        int y[][] = new int[5][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = i + 1;
            }
            System.out.println("X: "+x[i].length);
            System.out.println("Y "+y[i].length);
        }
    }
}
