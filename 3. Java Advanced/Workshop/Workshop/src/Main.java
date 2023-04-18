public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(3);
        stack.push(6);
        stack.push(1);
        stack.push(11);
        stack.push(132);
        stack.push(112);
        stack.push(643);
        stack.push(4);
        stack.push(55);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

        System.out.println();

        stack.forEach(System.out::println);
    }
}
