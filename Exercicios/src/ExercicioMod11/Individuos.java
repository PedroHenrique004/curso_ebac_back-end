package ExercicioMod11;
import java.util.Scanner;

import java.util.Scanner;

public class Individuos implements Comparable <Individuos>  {


    public String nome;

    public char sexo;

    public Individuos(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNome() {

        return nome;
    }

    @Override
    public String toString() {
        return nome + sexo;
    }

    @Override
    public int compareTo(Individuos individuo) {
        return this.nome.compareTo(individuo.getNome());
    }

}
