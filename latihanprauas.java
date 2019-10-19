public class latihanprauas {
    public static void sapa (String nama, String jurusan, int umur) {
        System.out.println("nama " +nama);
        System.out.println("jurusan " +jurusan);
        System.out.println("umur " +umur);
    }

    public static void main(String[] args) {
        sapa("faizah", "teknik informatika", 19);
        luaslingkaran(4);

    }
    public static void luaslingkaran (int r){
        double d= Math.PI*r*r;
        System.out.println(d);
    }
}
