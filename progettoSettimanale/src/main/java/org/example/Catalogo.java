package org.example;

public abstract class Catalogo {
    String codiceISBM;
    String titolo;
    int annoPubblica;
    int numPag;

    public Catalogo(String codiceISBM, String titolo, int annoPubblica, int numPag) {
        this.codiceISBM = codiceISBM;
        this.titolo = titolo;
        this.annoPubblica = annoPubblica;
        this.numPag = numPag;
    }

    public String getCodiceISBM() {
        return codiceISBM;
    }

    public void setCodiceISBM(String codiceISBM) {
        this.codiceISBM = codiceISBM;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public int getAnnoPubblica() {
        return annoPubblica;
    }

    public void setAnnoPubblica(int annoPubblica) {
        this.annoPubblica = annoPubblica;
    }


    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceISBM='" + codiceISBM + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblica=" + annoPubblica +
                ", numPag=" + numPag +
                '}';
    }
}
