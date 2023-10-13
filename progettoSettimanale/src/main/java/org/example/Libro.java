package org.example;

public class Libro extends Catalogo {
    String Autore;
    String Genere;


    public Libro(String codiceISBM, String titolo, int annoPubblica, int numPag, String autore, String genere) {
        super(codiceISBM, titolo, annoPubblica, numPag);
        Autore = autore;
        Genere = genere;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }


    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }
}
