package eximpressora;

public class Livros extends Documento{
    private int numPaginas;
    private String nomeAutor, tituloLivro, generoLivro;

    public Livros(int numPaginas, String nomeAutor, String tituloLivro, String generoLivro) {
        this.numPaginas = numPaginas;
        this.nomeAutor = nomeAutor;
        this.tituloLivro = tituloLivro;
        this.generoLivro = generoLivro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "numPaginas=" + numPaginas +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", tituloLivro='" + tituloLivro + '\'' +
                ", generoLivro='" + generoLivro + '\'' +
                '}';
    }
}
