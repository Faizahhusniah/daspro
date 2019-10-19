public class tabung {
    public static void main(String[] args) {
        //jari2
        double jari2 = 12;
        double tinggi = 20;
        //volume
        double volume = Math.PI *jari2*jari2*tinggi;
        //luas permukaan
        double luas = (2*Math.PI * jari2*jari2) + (2*Math.PI*jari2*tinggi);
        //cetak
        System.out.println("volume"+volume);
        System.out.println("Luas:"+luas);
    }
}
