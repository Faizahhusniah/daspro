public class atribut {
    //atribut
    public double sisi = 9;

    //mrthod
    public double luas () {
        return sisi*sisi;
    }
    // konstruktor
    public atribut (double sisiawal){
        sisi = sisiawal;
        System.out.println("Luas sementara = "+luas());
    }
}
