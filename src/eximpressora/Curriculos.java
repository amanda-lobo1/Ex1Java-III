package eximpressora;

import java.util.Arrays;

public class Curriculos extends Documento{
    private String nome;
    private String[] habilidades;
    private int idade;

    public Curriculos(String nome, String[] habilidades, int idade) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Curriculos{" +
                "nome='" + nome + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                ", idade=" + idade +
                '}';
    }
}

