public class array2D {
    public static void main(String[] args) {
        String[][] kotak = new String[][]{
                {
                        "INDONESIA", "jakarta"
                },
                {
                        "ITALIA", "roma"
                },
                {
                        "JEPANG", "tokyo"
                }
        };
        for (int x = 0; x < kotak.length; x++) {
            for (int y = 0; y < kotak[x].length; y++) {
                System.out.println(kotak[x][y]);
            }
            System.out.println("--------------------");
        }
    }
}