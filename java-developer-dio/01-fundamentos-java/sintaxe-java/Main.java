public class Main {
    public static void main(String[] args) {
        // Variáveis e tipos primitivos
        int idade = 28;
        double altura = 1.78;
        boolean ativo = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Ativo: " + ativo);

        // Controle de fluxo: if / else
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Laço for
        System.out.print("Números de 1 a 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Arrays
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // Chamando método
        int soma = somar(5, 7);
        System.out.println("Soma 5 + 7 = " + soma);
    }

    // Método estático simples
    public static int somar(int a, int b) {
        return a + b;
    }
}
