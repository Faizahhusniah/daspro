public class latihanprauas4 {
    public static void main(String[] args) {
        kampus myKampus;
        myKampus = new kampus();
        myKampus.setNama_kampus();
        myKampus.setJumlah_jurusan();
        myKampus.setJumlah_mahasiswa();
        myKampus.setAkreditasi_insstitusi();

        kampus myKampus2 = new kampus();
        myKampus2.tampil();


    }


    static class kampus {
        String nama_kampus;
        int jumlah_jurusan;
        char akreditasi_insstitusi;
        int jumlah_mahasiswa;


        void setNama_kampus() {
            nama_kampus = "UIN SUSKA";
        }

        void setJumlah_jurusan() {
            jumlah_jurusan = 30;
        }

        void setAkreditasi_insstitusi() {
            akreditasi_insstitusi = 'A';
        }

        void setJumlah_mahasiswa() {
            jumlah_mahasiswa = 1000;
        }

        void tampil() {
            System.out.println("Nama kampus " + nama_kampus);
            System.out.println("jumlah jurusan " + jumlah_jurusan);
            System.out.println("Akreditasi jurusan " + akreditasi_insstitusi);
            System.out.println("Jumlah mahasiswa " + jumlah_mahasiswa);

        }

        kampus() {
            nama_kampus = "UI";
            jumlah_jurusan = 10000;
            jumlah_mahasiswa = 40000;
            akreditasi_insstitusi = 'B';
        }
    }
}