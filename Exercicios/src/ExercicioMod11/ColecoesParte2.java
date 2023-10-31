package ExercicioMod11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte2 {

    public static void main(String args[]) {
        List<Individuos> individuos = lerNomeSexo();
        exibirPorSexo(individuos);
    }


    public static List<Individuos> lerNomeSexo() {
        Scanner sc = new Scanner(System.in);

        List<Individuos> individuos = new ArrayList<>();

        System.out.println("Digite o número de pessoas a serem cadastradas:");


        int numPessoas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (Masculino/Feminino): ");
            String sexoInput = sc.nextLine().toLowerCase();

            char sexo;

            if (sexoInput.equals("masculino")) {
                sexo = 'M';
            } else if (sexoInput.equals("feminino")) {
                sexo = 'F';
            } else {
                System.out.println("Opção de sexo inválida. Use 'Masculino' ou 'Feminino'.");
                i--;
                continue;
            }

            Individuos individuo = new Individuos (nome, sexo);
            individuos.add(individuo);

        }
        return individuos;

    }

    public static void exibirPorSexo(List<Individuos> individuos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo que deseja listar (Masculino/Feminino): ");
        String sexoInput = sc.nextLine().toLowerCase();

        char sexo;

        if (sexoInput.equals("masculino")) {
            sexo = 'M';
        } else if (sexoInput.equals("feminino")) {
            sexo = 'F';
        } else {
            System.out.println("Opção de sexo inválida. Use 'Masculino' ou 'Feminino'.");
            return;
        }

        System.out.println("Pessoas do sexo " + sexoInput + ":");
        for (Individuos individuo : individuos) {
            if (individuo.getSexo() == sexo) {
                System.out.println(individuo.getNome());
            }
        }
    }


}
