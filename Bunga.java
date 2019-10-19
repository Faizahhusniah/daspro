public class Bunga {
    public static void bunga(String nama) {
        System.out.println("Bunga ini adalah "+nama);
    }
    protected static void ordo(String nama){
        System.out.println("Ordo bunga ini adalah "+nama);
    }
    private static void warna (String nama){
        System.out.println("Warna bunga ini adalah "+nama);
    }

    public static void main(String[] args) {
        bunga("MAWAR, MELATI");
        ordo("ROSALES, LAMIALES");
        warna("MERAH, PUTIH");
    }
}
