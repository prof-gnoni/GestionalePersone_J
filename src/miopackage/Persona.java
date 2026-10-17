package miopackage;

public class Persona {
    private String cognome;
    private String nome;

    // Costruttori

    // Costruttore di Default
    public Persona() {
        this.cognome = "";
        this.nome = "";
    }

    // Costruttore parametrico
    public Persona(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    // Metodi Getter (per leggere i dati)
    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    // Metodi Setter (per modificare i dati)
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Metodo per stampare le informazioni della persona

    public void visualizza() {
        System.out.println( "Cognome: " + cognome + "\n" +
                            "Nome: " + nome + "\n");
    }
}
