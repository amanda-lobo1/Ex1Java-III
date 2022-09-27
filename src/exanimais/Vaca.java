package exanimais;

import java.sql.SQLOutput;

public class Vaca extends Animal implements Herbivoro{

    @Override
    public void emitirSom() {
        System.out.println("Muuh!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca come pasto");
    }
}
