package ExercicioMod11;
import java.util.Scanner;

import java.util.Scanner;

public class Individuos implements Comparable <Individuos>  {


    public String nome;

    public Individuos(String nome){
        this.nome = nome;
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
    public int compareTo(Individuos individuos) {
        return this.nome.compareTo(individuos.getNome());
    }
}
