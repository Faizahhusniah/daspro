public class RunningBalok {
    public static void main(String[] args) {
        Balok lingkaran []={new Balok(6), new Balok(7), new Balok (8)};
        Balok lingkaran1 []  = new Balok [4];
        lingkaran1[0] = new Balok(3);
        lingkaran1[1] = new Balok(4);
        lingkaran1[2] = new Balok(1);
        lingkaran1[3] = new Balok(9);

        double maks = lingkaran[0].luas();
        double min = lingkaran[0]. luas();


        for (int i=0; i<lingkaran.length;i++){
            System.out.println("Luas  : " +lingkaran[i].luas());
            if(lingkaran[i].luas() > maks ) maks= lingkaran[i].luas();
            if (lingkaran[i].luas() < min)  min = lingkaran[i].luas();
        }

        System.out.println("luas terbesar adalah " + maks);
        System.out.println("luas terkecil adalah " + min);

    }
}
