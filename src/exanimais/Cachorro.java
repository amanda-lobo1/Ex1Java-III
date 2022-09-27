package exanimais;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro come carne");
    }
}
