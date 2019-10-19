public class array3D {
    public static void main(String[] args) {
        //deklaraikan
        int tebal =3;
        int baris =4;
        int kolom =5;

        int [] [] [] array3Dimensi = new int [tebal] [baris] [kolom];

        for (int i=0; i< array3Dimensi.length;i++){
            int angka =1;
            System.out.println("tebal (lapisan) = " +i);
            for (int j=0; j< array3Dimensi[0].length;j++){
                for (int k =0; k < array3Dimensi[0][0].length;k++){
                    array3Dimensi [i][j][k] = angka++;
                    System.out.print(array3Dimensi[i][j][k]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
