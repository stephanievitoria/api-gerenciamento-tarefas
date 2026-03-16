package com.stephanie.taskmanager.controller;

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
    public List<Tarefa> listar() {
        return service.listarTarefas();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return service.criarTarefa(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return service.atualizarTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarTarefa(id);
    }
}
