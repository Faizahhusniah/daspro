public class konversiangkahuruf{
    public static void main(String[] args) {
    konversiangkahuruf b = new konversiangkahuruf();
    b.angkahuruf(100);
    }
    public  void angkahuruf(int a){
        int nilai = a;
        if (nilai <=100 && nilai >=85){
            System.out.println("A");
        }
        if (nilai <85 && nilai>= 80 ) {
            System.out.println("A-");
        }
        if (nilai <80 && nilai >=75){
            System.out.println("B+");
        }
        if (nilai <75 && nilai >= 70 ) {
            System.out.println("C+");
        }
        if (nilai>= 55 && nilai <60 ){
            System.out.println("C");
        }
        if (nilai >=50 && nilai < 55){
            System.out.println("D");
        }
        if (nilai <50 ){
            System.out.println("E");
        }

    }
}