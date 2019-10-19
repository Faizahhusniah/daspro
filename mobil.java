
public class mobil {
    //properti
    String aktifitas;
    String warna = "merah";
    int kecepatan = 0;

    //fungsi method
    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";

        } else {
            aktifitas = "bergerak";
        }

    }
void cetakAtribut() {
    System.out.println("warna="+warna);
    System.out.println("kecepatan="+kecepatan);
    System.out.println("aktifitas="+aktifitas);
    }

    public static void main(String[] args) {
        mobil mobilku = new mobil();
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}