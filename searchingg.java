public class searchingg {
    public static void main(String[] args) {

        int [] data ={64,49,70,66,59};
        for (int x = 0; x < data.length - 1; x++){
            //bubleshot
            for (int i = 0; i < data.length - 1-x; i++){

            if(data[i] < data[i+1] ) {
                int temp = data[i];
                data[i] = data[i+1];
                data[i + 1] = temp;

//kalau dari besar ke kecil <, kAlau dari kecil ke besar >



                }
            }
        }
        //output
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+",");
    }

    }

}

