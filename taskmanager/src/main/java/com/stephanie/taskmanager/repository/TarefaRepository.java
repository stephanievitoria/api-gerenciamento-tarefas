package com.stephanie.taskmanager.repository;

import com.stephanie.taskmanager.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
