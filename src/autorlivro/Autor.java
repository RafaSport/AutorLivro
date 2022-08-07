package autorlivro;

public class Autor {

    private String nome;
    private String email;
    private char genero;

    public Autor(String nome, String email, char genero) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", email=" + email + ", genero=" + genero + "]";
    }

    public boolean equals(Autor outro) {
        if( outro != null &&
                this.nome != null &&
                this.email != null &&
                this.nome.equals(outro.nome) && 
                this.email.equals(outro.email) ) 
        {
                return true;
        }
        return false;
    }
}
