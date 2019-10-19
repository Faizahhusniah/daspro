public class stackpersegi {
    private persegi data[];
    private int top;

    public stackpersegi (int jumlah){
        data = new persegi[jumlah];
        top=-1;
    }

    public void push (persegi nilai){
        if(top<data.length-1){
            data[++top]=nilai;
        }
    }

    public persegi pop (){
        if(top>=0){
            persegi temp = data[top--];
            return temp;
        }
        return null;
    }

    public void print(){
        for (int i=data.length-1; i>=0;i--){
            System.out.println(data[i]);
        }
    }


}