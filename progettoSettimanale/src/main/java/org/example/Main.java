package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Libro lib1 = new Libro("932413", "Il Guardiano degli Innocenti", 2010, 370, "Andrzej Sapkowsk", "Fantasy");
        Libro lib2 = new Libro("932420", "La Spada del Destino", 2011, 393, "Andrzej Sapkowsk", "Fantasy");
        Libro lib3 = new Libro("932437", "Il Sangue degli Elfi", 2012, 393, "Andrzej Sapkowsk", "Fantasy");
        Rivista riv1 = new Rivista("853654", "Game Informer", 1991, 25, Periodicita.SETTIMANALE);
        Rivista riv2 = new Rivista("853698", "Imagine Games Network", 2012, 32, Periodicita.MENSILE);
        Rivista riv3 = new Rivista("853615", "GameSpot", 1996, 40, Periodicita.SEMESTRALE);


        Set<Catalogo> pippoCatalogo = new HashSet<Catalogo>();
        pippoCatalogo.add(lib1);
        pippoCatalogo.add(lib2);
        pippoCatalogo.add(lib3);
        pippoCatalogo.add(riv1);
        pippoCatalogo.add(riv2);
        pippoCatalogo.add(riv3);

        System.out.println("************RIMOZIONE************");
        remElem("932413", pippoCatalogo);
        System.out.println(pippoCatalogo);
        System.out.println("************AGGIUNTA************");
        addElem(lib1, pippoCatalogo);
        System.out.println(pippoCatalogo);
        System.out.println("************Ricerca per ANNO************");
        srcAnno(pippoCatalogo, 2012);
        System.out.println("************Ricerca per AUTORE************");
        srcAutore(pippoCatalogo, "Andrzej Sapkowsk");
        System.out.println("************Ricerca per ISBM************");
        srcIsbn(pippoCatalogo, "853698");
    }


    //************AGGIUNTA************\\
    static void addElem(Catalogo elem, Set<Catalogo> contenitore) {
        if (contenitore.add(elem)) {
            System.out.println("AGGIUNTO CON SUCCESSO!!");
        } else {
            System.out.println("ERRORE!!");
        }
    }


    //************RIMOZIONE************\\
    static void remElem(String Isbm, Set<Catalogo> contenitore) {
        if (contenitore.removeIf(elm -> elm.getCodiceISBM().equals(Isbm))) {
            System.out.println("codice:" + " " + Isbm + " " + "ELIMINATO!!");
        } else {
            System.out.println("CODICE NON TROVATO!!");
        }
    }


    //************Ricerca per ANNO************\\
    static void srcAnno(Set<Catalogo> contenitore, int anno) {
        Set<Catalogo> pippoFiltro = contenitore.stream().filter(ey -> ey.getAnnoPubblica() == anno).collect(Collectors.toSet());
        System.out.println("Elementi trovati:" + " " + anno);
        System.out.println("*************");
        for (Catalogo elem : pippoFiltro) {
            System.out.println(elem);
        }
    }


    //************Ricerca per ISBN************\\
    static void srcIsbn(Set<Catalogo> contenitore, String isbn) {
        Set<Catalogo> pippoFiltro = contenitore.stream().filter(isb -> Objects.equals(isb.getCodiceISBM(), isbn)).collect(Collectors.toSet());
        System.out.println("Elementi trovati con codice:" + " " + isbn);
        System.out.println("*************");
        for (Catalogo elem : pippoFiltro) {
            System.out.println(elem);
        }
    }


    //************Ricerca per AUTORE************\\
    static void srcAutore(Set<Catalogo> contenitore, String autore) {
        Set<Catalogo> pippoFiltrato = contenitore.stream()
                .filter(auto -> auto instanceof Libro)
                .filter(auto -> ((Libro) auto).getAutore().equalsIgnoreCase(autore))
                .collect(Collectors.toSet());
        System.out.println("elementi trovati con autore: " + autore);
        System.out.println("**********");
        for (Catalogo elemento : pippoFiltrato) {
            System.out.println(elemento);
        }
    }

}
