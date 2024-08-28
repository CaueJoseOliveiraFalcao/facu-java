import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private Long id;
    private String nome;

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {  // Corrigi o método setId
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}

public class ExemplosList {  // Certifique-se que esta classe está no mesmo arquivo ou em um arquivo separado chamado ExemplosList.java
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "caue"));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Pessoa a = pessoas.get(0);
        pessoas.add(a);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
