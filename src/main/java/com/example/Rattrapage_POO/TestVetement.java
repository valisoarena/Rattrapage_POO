package com.example.Rattrapage_POO;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestVetement {

    @Test

    void coutTotal(){
        Vetement v1 = new Vetement("pantalon",Taille.XS,20.0,"coton");
        Vetement v2 = new Vetement("chemise",Taille.L,20.0,"lain");

        List<Vetement>vetementCommander = new ArrayList<>();
        vetementCommander.add(v1);
        vetementCommander.add(v2);

        double resultat = 0;
        for (Vetement v:vetementCommander){
            resultat += v.getPrixUnitaire();
        }
        System.out.println(resultat);

    }

}
