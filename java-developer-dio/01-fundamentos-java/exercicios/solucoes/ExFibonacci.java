public class ExFibonacci {
    public static void main(String[] args) {
        int n = 10; // padrão
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argumento inválido, usando 10");
            }
        }

        if (n <= 0) {
            System.out.println("Informe um número inteiro positivo.");
            return;
        }

        long a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) System.out.print(", ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
