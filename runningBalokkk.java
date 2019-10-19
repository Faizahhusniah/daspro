public class runningBalokkk {
    public static void main(String[] args) {
        Balokkk b [] = {new Balokkk(2,3,6), new Balokkk(4,7,8), new Balokkk(7,8,4) };
        Balokkk bb [] = new Balokkk[4];
         bb[0] = new Balokkk(3,5,6);
        bb[1] = new Balokkk(1,5,6);
        bb[2] = new Balokkk(1,5,7);
        bb[3] = new Balokkk(1,4,6);
 double maks = b[0].Volume();
 double min = b[0].Volume();
       for (int i =0; i<b.length; i++){
           System.out.println("Volume Tabung = "+ b[i].Volume());
           if (b[i].Volume() > maks) maks = b[i].Volume();
           if (b[i].Volume() < min) min = b[i].Volume();

       }
        System.out.println("Volume Terbesar adalah "+maks);
        System.out.println("Volume Terkecil adalah "+min);




    }
}
