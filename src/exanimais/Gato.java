package exanimais;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato come carne");
    }
}
