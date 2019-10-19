public class method {
    public static void main(String[] x) {
        angka(86);
    }
    public static  void angka (int a){
        int nilai = a;
        if (nilai <= 100 && nilai>=85 ){
            System.out.println("A");
            if(nilai >=80 && nilai < 85){
                System.out.println("B");
            }
            if (nilai <80 && nilai >=75){
                System.out.println("B+");
            }
            if (nilai < 75 && nilai>=70){
                System.out.println("B");
            }
            if (nilai <70 && nilai >=65) {
                System.out.println("B-");
            }
            if (nilai <60 && nilai >=55){
                System.out.println("C+");
            }
            if (nilai <50 && nilai >= 45){
                System.out.println("C");
            }
            if(nilai <40 && nilai >=35){
                System.out.println("C-");
            }
            if (nilai <30 && nilai >=25){
                System.out.println("D+");
            }
            if (nilai < 20 && nilai >= 15){
                System.out.println("D");
            }
            if (nilai <10 && nilai >=5){
                System.out.println("D-");
            }
            if (nilai <5 && nilai >0){
                System.out.println("E");
            }
        }
    }

}
