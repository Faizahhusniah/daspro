public class MaxValue {
    public static void main(String[] args) {
        int [] nilai = {6,7,8,9,10,11};
        int maks = nilai[0];
        int min = nilai[0];
        for (int i =0; i<nilai.length; i++){
            if (nilai[i] % 2 == 0 && nilai[i] > maks) maks =nilai[i];
        }

        System.out.println(maks);
    }
    //prinsip looping berdasarkan perbandingan indeks
    // 0 dibandingkan dengan 1       // 0 dibandingkan dengan 1   dst
    //  1 -------------------- 2    // 1--------------------2
    // 2---------------------3     //2--------------------3
    // 3---------------------4     // 3-------------------4
    // 4---------------------5

}
