package alpro;

public class mahasiswa {
    public String nama;
    public String nim;
    public int nilai;
    public int TahunLahir;

    public mahasiswa (String na, String ni, int nil, int th){
        nama = na;
        nim= ni;
        TahunLahir = th;
    }
    public void cetak () {
        System.out.println("Nama\t:"+nama);
        System.out.println("Nim\t :"+nim);
        System.out.println("Nilai\t:"+nilai);
        System.out.println("Umur\t:"+umur());
    }
    public int umur (){
        return 2019-TahunLahir;
    }
}
