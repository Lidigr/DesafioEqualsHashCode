import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Pessoa> pessoas = new HashSet <>();

        pessoas.add(new Pessoa("Pedro", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Carlos", 22));
        pessoas.add(new Pessoa("Juan", 25));
        pessoas.add(new Pessoa("Antonio", 30));
        pessoas.add(new Pessoa("João", 28));
        pessoas.add(new Pessoa("Maria", 22));

        System.out.println("====CADASTRO DE PESSOAS====");

        System.out.println("Quantidade final de pessoas: " + pessoas.size());

        System.out.println("\nPesoas cadastradas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n====EXPLICAÇÂO====");
        System.out.println("O HashSet não permite elementos duplicados.");

        System.out.println("Quando adicionamos uma pessooa, o HashSet utiliza"
                + "O método equals() é utilizado para verificar"
                + "O objetivo deve ser armazenado");

        System.out.println("Quando existem objetos com o mesmo código hash, "
                + "O método equals() é utilizado para verificar"
                + "se eles realmente são iguais. ");

        System.out.println("Como sobreescrevemos equals() e hashCode(), "
                 + "pessoas com o mesmo nome e a mesma idade "
                 + "são consideradas iguais");
        System.out.println("Por isso, as pessoas repetidas não foram adicionada novamente aos conjunto");
    }
}
