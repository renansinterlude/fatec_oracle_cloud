import java.util.Set;

public class TesteLombok {
    public static void main(String[] args) {
        var p = new Pessoa(1, "Ana", "Ver filmes", 0); // var: compilador infere o tipo
        p.setNome("Ana");
        System.out.println(p.getNome());
    }
}
