public class main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("uno");
        stack.push("due");
        stack.push("tre");

        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack vuoto? " + stack.isEmpty());
    }
}