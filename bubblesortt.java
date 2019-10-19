public class bubblesortt {
    public static void main(String[] args) {
        int [] data = {18,19,2,3,6,7,9,10};
        for (int x =0; x<data.length-1;x++ ) {
            //bubblesort
            for (int i = 0; i < data.length - 1 - x; i++) {
                if (data[i] < data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
        for (int i=0; i<data.length; i++ ){
            System.out.print(data[i]+",");
        }
    }

}
