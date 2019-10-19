public class BelajarBubbleSort {
    public static void main(String[] args) {

        //int[] data = {8,7,6,5,4};
        Mahasiswa data[] = {
                new Mahasiswa("Citra","023",78,2018),
                new Mahasiswa("Widya","791",61,2018),
                new Mahasiswa("Zainal","820",87,2018),
                new Mahasiswa("Eka","304",90,2018),
                new Mahasiswa("Budi","211",69,2018),
        };

        int cek = 1;

        // Bubble Sort
        for (int x = 0; x < data.length - 1; x++) {
            for (int i = 0; i < data.length - 1; i++) {
                //System.out.print("cek " + cek++ + " : " + i + " => " + (i+1));
                if( data[i].nama.compareTo(data[i+1].nama) > 0  ) {
                    Mahasiswa temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    //System.out.println(" : Switch");
                } //else {
                //System.out.println(" : X");
                //}
            }
        }

        // Output
        for (int i = 0; i < data.length; i++) {
            //System.out.print(data[i] + ",");
            data[i].cetak();
        }

    }
}

