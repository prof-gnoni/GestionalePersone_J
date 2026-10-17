package miopackage;
public class Data {
    // --- ATTRIBUTI ---
    private int giorno;
    private int mese;
    private int anno;

    // --- COSTRUTTORI ---

    // Costruttore di default (crea la data 1/1/1970)
    public Data() {
        this.giorno = 1;
        this.mese = 1;
        this.anno = 1970;
    }

    // Costruttore con parametri
    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    // --- GETTERS ---
    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    // --- SETTERS ---
    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }
    public void setMese(int mese) {
        this.mese = mese;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    // Metodi di Utilità
    public void visualizza() {
        System.out.println(giorno+"/"+mese+"/"+anno);
    }
}