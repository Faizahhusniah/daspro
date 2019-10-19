public class rozijAHAT {
    public static void main(String[] args) {
        int i,a;
        a=0;
        for (i=1; i<=8;i++){
            a+=i;
            if (i==6) continue;;
        }
        System.out.println(++a);
    }
}
