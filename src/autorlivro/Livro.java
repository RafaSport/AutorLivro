package autorlivro;

public class Livro {

    // Atributos
    private String nome;
    private Autor[] autor = new Autor[10];
    private double preco;
    private int estoque;
    private int contador;

    // Construtor
    public Livro(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        contador = 0;
    }

    // Metodos Publicos
    public boolean addAutor(Autor outroAutor) {
        if (contador < 10) {
                autor[contador] = outroAutor;
                contador++;
                return true;
        }
        return false;
    }

    // Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor1=" + autor[0] + ", autor2=" + autor[1] + ", preco=" + preco + ", estoque=" + estoque + "]";
    }

    public boolean equals(Livro outro) {

        if (this.nome.equals(outro.nome) && this.estoque == outro.estoque && this.preco == outro.preco) {
                return true;

        }
        return false;
    }
}
