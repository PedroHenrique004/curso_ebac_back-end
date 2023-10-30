package ExercicioMod11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte2 {

    public static void main(String args[]){

        lerNome();
    }

    public static void lerNome() {

        List<Individuos> lista = new ArrayList<Individuos>();

        Individuos a = new Individuos("Pedro");
        Individuos b = new Individuos("Ana");
        Individuos c = new Individuos("Gabriel");

        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println("Fora da ordem alfabetica:" + lista);

        Collections.sort(lista);

        System.out.println("Em ordem alfabetica:"+ lista);
    }
}
