package alpro;

public class Bubblesort {
    public static void main(String[] args) {
        mahasiswa data [] = { new mahasiswa("faizah","024",80,1999),
                              new mahasiswa("chainisa","60",78,2000),
                                new mahasiswa("paula","78",90,1999),
                               new mahasiswa("fira","70",67,2000)};
        int cek = 1;

        //bubble sort
        for (int x=0; x<data.length-1; x++){
            for (int i =0; i<data.length-1; i++){
                if(data[i].nilai < data[i+1].nilai){
                    mahasiswa temp = data[i];
                    data[i] = data[i+1];
                    data[i+1]= temp;
                }
            }
        }

        for (int i=0; i<data.length; i++){
            //buat ngeprint semuanya
            data[i].cetak();
        }

    }
}
