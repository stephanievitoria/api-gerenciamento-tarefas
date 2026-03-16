package com.stephanie.taskmanager.service;

import com.stephanie.taskmanager.model.Tarefa;
import com.stephanie.taskmanager.repository.TarefaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TarefaServiceTest {

    @Mock
    private TarefaRepository repository;

    @InjectMocks
    private TarefaService service;

    public TarefaServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveCriarTarefa() {

        Tarefa tarefa = new Tarefa("Estudar Spring");

        when(repository.save(tarefa)).thenReturn(tarefa);

        Tarefa resultado = service.criarTarefa(tarefa);

        assertEquals("Estudar Spring", resultado.getTitulo());
        verify(repository, times(1)).save(tarefa);
    }

    @Test
    void deveAtualizarTarefa() {

        Tarefa tarefaExistente = new Tarefa("Estudar Java");

        Tarefa tarefaAtualizada = new Tarefa("Estudar Spring Boot");

        when(repository.findById(1L)).thenReturn(Optional.of(tarefaExistente));
        when(repository.save(any(Tarefa.class))).thenReturn(tarefaExistente);

        Tarefa resultado = service.atualizarTarefa(1L, tarefaAtualizada);

        assertEquals("Estudar Spring Boot", resultado.getTitulo());
    }

    @Test
    void deveDeletarTarefa() {

        Tarefa tarefa = new Tarefa("Estudar Testes");

        when(repository.findById(1L)).thenReturn(Optional.of(tarefa));

        service.deletarTarefa(1L);

        verify(repository, times(1)).delete(tarefa);
    }
}