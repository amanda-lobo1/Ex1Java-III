package eximpressora;

public class Relatorios extends Documento{
    private String texto;
    private String autor, revisor;
    private int numPaginas;

    public Relatorios(String texto, String autor, String revisor, int numPaginas) {
        this.texto = texto;
        this.autor = autor;
        this.revisor = revisor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Relatorios{" +
                "texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
