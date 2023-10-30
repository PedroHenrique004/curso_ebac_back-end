package ExercicioMod11;
import java.util.Scanner;

import java.util.Scanner;

public class Individuos implements Comparable <Individuos>  {


    public String nome;

    public String sexo;

    public Individuos(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.sexo;
    }

    @Override
    public int compareTo(Individuos individuos) {
        return this.nome.compareTo(individuos.getNome());
    }

    @Override
    public int compareTo(Individuos individuos) {
        return this.sexo.compareTo(individuos.getSexo());
    }
}
