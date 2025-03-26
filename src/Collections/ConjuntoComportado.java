package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("gabriel");
        listaAprovados.add("felipe");
        listaAprovados.add("ana");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
    }
}
