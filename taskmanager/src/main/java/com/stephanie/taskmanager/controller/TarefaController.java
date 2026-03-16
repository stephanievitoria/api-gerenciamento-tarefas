package com.stephanie.taskmanager.controller;

import com.stephanie.taskmanager.dto.ApiResponse;
import com.stephanie.taskmanager.model.Tarefa;
import com.stephanie.taskmanager.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public ApiResponse<List<Tarefa>> listar() {
        List<Tarefa> tarefas = service.listarTarefas();

        return new ApiResponse<>("Tarefas listadas com sucesso", tarefas);
    }

    @PostMapping
    public ApiResponse<Tarefa> criar(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = service.criarTarefa(tarefa);

        return new ApiResponse<>("Tarefa criada com sucesso", novaTarefa);
    }

    @PutMapping("/{id}")
    public ApiResponse<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa tarefaAtualizada = service.atualizarTarefa(id, tarefa);

        return new ApiResponse<>("Tarefa atualizada com sucesso", tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deletar(@PathVariable Long id) {
        service.deletarTarefa(id);

        return new ApiResponse<>("Tarefa deletada com sucesso", null);
    }
}
