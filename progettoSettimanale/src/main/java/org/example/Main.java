package org.example;

import java.util.HashSet;
import java.util.Set;

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

        System.out.println(pippoCatalogo);
    }


}
