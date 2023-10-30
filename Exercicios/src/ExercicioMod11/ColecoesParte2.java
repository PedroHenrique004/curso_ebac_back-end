package ExercicioMod11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte2 {

    public static void main(String args[]){

        lerNome();
    }

    public static void lerNome() {
        Scanner sc = new Scanner(System.in);

        List<Individuos> lista = new ArrayList<Individuos>();

        int numIndivuduos = 0;

        System.out.println("Digite o numero de individuos:");
        int numIndividuos = sc.nextInt();


        
        for (int i = 0; i <= numIndivuduos; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo " + (i + 1) + ": ");
            String sexo = sc.nextLine();

            Individuos individuo = new Individuos(nome);
            lista.add(nome);

            Individuos individuo = new Individuos(sexo);
            lista.add(sexo);
        }

    }
}
