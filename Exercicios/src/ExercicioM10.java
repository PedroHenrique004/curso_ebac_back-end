import java.util.Scanner;

public class ExercicioM10 {

    public static void main(String args[]){


        calcularMediaNotas();

    }

        public static void calcularMediaNotas(){
            Scanner sc = new Scanner(System.in);

            int nota1 = sc.nextInt();
            int nota2 = sc.nextInt();
            int nota3 = sc.nextInt();
            int nota4 = sc.nextInt();
            float soma;
            float media;

            soma = nota1 + nota2 + nota3 + nota4;
            media = soma/4;

            System.out.println("Média do aluno:" + media);

            if (media >= 7){
                System.out.println("O aluno está aprovado");
            }
            else if (media >= 5) {
                System.out.println("O aluno está de recuperação");
            }
            else{
                System.out.println("O aluno está reprovado");
            }

        }
    }
