package com.stephanie.taskmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private boolean concluida;

    public Tarefa() {}

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }
}
