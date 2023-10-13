package org.example;

public class Rivista extends Catalogo {
    Periodicita periodicita;

    public Rivista(String codiceISBM, String titolo, int annoPubblica, int numPag, Periodicita periodicita) {
        super(codiceISBM, titolo, annoPubblica, numPag);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                ", codiceISBM='" + codiceISBM + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblica=" + annoPubblica +
                ", numPag=" + numPag +
                '}';
    }
}
