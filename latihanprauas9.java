public class latihanprauas9 {
    public static void main(String[] args) {
        char jwb [][] = {{'A','B','C','E','A','C','D','D','A','B'},{'E','A','D','A','B','C','D','C','A','B'},
                {'B','A','C','E','D','B','A','B','C','B'}};
        char kunci[] = {'A','E','C','D','A','B','C','C','A','B'} ;
        int hasil [] = jumlah(jwb,kunci);
        printArray(hasil);

    }

    public static int[] jumlah (char jwb[][], char kunci[]) {
        int jml [] = new int[3];
        for (int i =0; i<jwb.length; i++){
            int x =0;
            for (int j=0; j<jwb[i].length; j++){
                if(jwb[i][j] == kunci[j]){
                        x++;
                }
            }
            jml[i]=x;
        }
        return jml;

    }

    public static void printArray (int[] jumlah) {
        System.out.println("Jumlah Jawaban Benar : ");
        for (int z=0; z<3;z++){
            System.out.println("Mahasiswa ke-"+(z+1)+":"+jumlah[z]);
        }

    }
}
