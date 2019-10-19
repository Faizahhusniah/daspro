public class AppArrayClass {
    public static void main(String[] args) {

        latihanpencarian [] s = {new latihanpencarian (12,13,20), new latihanpencarian(21,32,4)};
        latihanpencarian  tb [] = new latihanpencarian[4];
        tb [0] = new latihanpencarian(1,2,3);
        tb [1] = new latihanpencarian(4,5,6);
        tb [2] = new latihanpencarian(1,2,4);
        tb [3] = new latihanpencarian(5,6,7);
double max = tb[0].keliling();
double min = tb[0].keliling();
        for (int i =0; i<s.length;i++){
            System.out.println("Luas Permukaan Tabung = "+tb[i].keliling());
            if (tb[i].luas() < min) min = tb[i].keliling();
            if (tb[i].luas() > max) max=tb[i].keliling();
        }
        System.out.println("array terbesar = "+max);
        System.out.println("Array Terkecil = "+min);

    }
}
