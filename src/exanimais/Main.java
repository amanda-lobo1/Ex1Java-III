package exanimais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.comerCarne();
        System.out.println();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.comerCarne();
        System.out.println();

        Vaca vaca = new Vaca();
        vaca.emitirSom();
        vaca.comerPasto();
    }
}
