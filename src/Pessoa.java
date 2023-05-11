import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // construtor com todos os parametros
@NoArgsConstructor // construtor sem nenhum parametros
public class Pessoa {
  private int codigo;
  private String nome, hobby;
  private int idade;
}


