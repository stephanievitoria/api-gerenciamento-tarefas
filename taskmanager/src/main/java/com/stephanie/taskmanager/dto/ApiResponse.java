package com.stephanie.taskmanager.dto;

import lombok.Getter;

@Getter
public class ApiResponse<T> {

    private String mensagem;
    private T dados;

    public ApiResponse(String mensagem, T dados) {
        this.mensagem = mensagem;
        this.dados = dados;
    }
}
