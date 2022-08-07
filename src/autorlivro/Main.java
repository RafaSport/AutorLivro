package autorlivro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nome, email;
        char genero;
        double preco;
        int qtd;
        // ------------------------------------------------------------------------------------------------
        System.out.println("Digite as informações do Autor1: ");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Email: ");
        email = teclado.next();

        System.out.print("Genero: ");
        genero = teclado.next().charAt(0);

        Autor a1 = new Autor(nome, email, genero);
        // ---------------------------------------------------------------------------------------------------
        System.out.println("Digite as informações do Autor2: ");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Email: ");
        email = teclado.next();

        System.out.print("Genero: ");
        genero = teclado.next().charAt(0);

        Autor a2 = new Autor(nome, email, genero);
        // ---------------------------------------------------------------------------------------------------
        System.out.println("Digite as informações do Autor3: ");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Email: ");
        email = teclado.next();

        System.out.print("Genero: ");
        genero = teclado.next().charAt(0);

        Autor a3 = new Autor(nome, email, genero);
        // ---------------------------------------------------------------------------------------------------
        System.out.println("Digite as informações do Autor4: ");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Email: ");
        email = teclado.next();

        System.out.print("Genero: ");
        genero = teclado.next().charAt(0);

        Autor a4 = new Autor(nome, email, genero);
        // ====================================================================================================
        System.out.println("Informações do Livro1:");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Preço: ");
        preco = teclado.nextDouble();

        System.out.print("Estoque: ");
        qtd = teclado.nextInt();

        Livro l1 = new Livro(nome, preco, qtd);

        // ====================================================================================================
        System.out.println("Informações do Livro2:");
        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Preço: ");
        preco = teclado.nextDouble();

        System.out.print("Estoque: ");
        qtd = teclado.nextInt();

        Livro l2 = new Livro(nome, preco, qtd);
        // ====================================================================================================

        l1.addAutor(a1);
        l1.addAutor(a2);
        l2.addAutor(a3);
        l2.addAutor(a4);
        /*
         * System.out.println("Informações do Livro3:"); System.out.println("Nome: ");
         * nome = teclado.next();
         * 
         * System.out.println("Nome: "); preco = teclado.nextDouble();
         * 
         * System.out.println("Nome: "); qtd = teclado.nextInt();
         *
         * Livro l3 = new Livro(nome, a2, preco, qtd);
         */
        System.out.println(l1 + "\n" + l2);

        /*
         * Autor a = new Autor("Rafael", "rafael@gmail.com", 'M'); Autor b = new
         * Autor("Rafael", "rafael@gmail.com", 'F');
         * 
         * Livro c = new Livro("JavaDoc", null, 30.50, 50); Livro d = new
         * Livro("JavaDoc", b, 30.50, 50);
         * 
         * System.out.println("Autor = " + a.equals(b)); System.out.println("Livro = " +
         * c.equals(d));
         */
        teclado.close();
    }
    
}
