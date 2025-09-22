package br.com.curso.todolist.api.tarefa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // Define esta classe como um Controller REST.
@RequestMapping("/tarefas") // Define a URL base para todos os métodos deste controller.
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping // Mapeia requisições HTTP GET para /tarefas para este método.
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTodas();
    }
}