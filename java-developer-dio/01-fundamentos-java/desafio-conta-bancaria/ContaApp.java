public class ContaApp {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, "Alice", 1000.0);
        Conta c2 = new Conta(2, "Bob", 200.0);

        System.out.println("Estado inicial:");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\nAlice deposita 250.50");
        c1.depositar(250.50);

        System.out.println("Alice tenta transferir 500 para Bob");
        boolean ok = c1.transferir(c2, 500);
        System.out.println("Transferência bem-sucedida? " + ok);

        System.out.println("\nEstado final:");
        System.out.println(c1);
        System.out.println(c2);
    }
}
