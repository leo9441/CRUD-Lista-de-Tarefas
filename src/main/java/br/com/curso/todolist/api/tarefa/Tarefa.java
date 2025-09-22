package br.com.curso.todolist.api.tarefa;

import jakarta.persistence.*;
import lombok.Data;

@Data // Anotação do Lombok que gera getters, setters, toString, etc.
@Entity // Anotação do JPA que marca esta classe como uma entidade do banco de dados.
@Table(name = "tb_tarefas") // Define o nome da tabela no banco de dados.
public class Tarefa {

    @Id // Marca o atributo 'id' como a chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura a geração automática do ID pelo banco.
    private Long id;

    private String titulo;
    private String descricao;
    private boolean concluida;
}