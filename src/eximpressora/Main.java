package eximpressora;

public class Main {
    public static void main(String[] args) {
        Curriculos curriculos = new Curriculos("Amanda",
                new String[]{"Java, Programação Orientada a Objetos"}, 20);
        Impressora.imprimirDocumentos(curriculos);
        System.out.println();

        Livros livros = new Livros(244, "Gabriela Costa",
                "A Lágrima de Vidro", "Fantasia");
        Impressora.imprimirDocumentos(livros);
        System.out.println();

        Relatorios relatorios = new Relatorios("Isso é um relatório",
                "Larissa", "Samuel", 50);
        Impressora.imprimirDocumentos(relatorios);
    }
}
