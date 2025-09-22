package br.com.curso.todolist.api.tarefa;

import org.springframework.stereotype.Service;
import java.util.List;

@Service // Marca a classe como um componente de serviço gerenciado pelo Spring.
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    // Injeção de dependência via construtor (prática recomendada).
    // O Spring vai "injetar" uma instância de TarefaRepository aqui.
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    // Futuramente, outros métodos (criar, atualizar, deletar) serão adicionados aqui.
}