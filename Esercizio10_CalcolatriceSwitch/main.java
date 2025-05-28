public class main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Utilizzo: <num1> <operazione> <num2>");
            return;
        }
        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = Integer.parseInt(args[2]);
        int risultato = 0;
        switch (op) {
            case "+": risultato = a + b; break;
            case "-": risultato = a - b; break;
            case "*": risultato = a * b; break;
            case "/": 
                if (b == 0) {
                    System.out.println("Divisione per zero!");
                    return;
                }
                risultato = a / b; break;
            default:
                System.out.println("Operazione non riconosciuta.");
                return;
        }
        System.out.println("Risultato: " + risultato);
    }
}