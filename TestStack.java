public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(6);

        System.out.println("Data AWAL ");
        stack.push(70);
        stack.push(10);
        stack.push(56);
        stack.print();
        System.out.println();
        stack.pop();
        System.out.println("setelah pop data ");
        stack.print();
        stack.push(-99);
        System.out.println("setelah push data");
        stack.print();
    }
}
