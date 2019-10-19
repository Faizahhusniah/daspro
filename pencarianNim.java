public class pencarianNim {
    public static void main(String[] args) {
        String [] nim = {"11850120304", "11850120506", "11850120307"};
        for (int i =0; i<nim.length; i++) {
            if (nim[i] == "11850120304"){
                System.out.println("Nim "+nim[i]+" berada pada indeks ke "+i);
            }
        }
    }
}
