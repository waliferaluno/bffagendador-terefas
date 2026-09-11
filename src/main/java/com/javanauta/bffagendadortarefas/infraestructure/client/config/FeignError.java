package com.javanauta.bffagendadortarefas.infraestructure.client.config;

import com.javanauta.bffagendadortarefas.infraestructure.exception.BussinesException;
import com.javanauta.bffagendadortarefas.infraestructure.exception.ConflictException;
import com.javanauta.bffagendadortarefas.infraestructure.exception.ResourceNotFoundException;
import com.javanauta.bffagendadortarefas.infraestructure.exception.UnauthorizedException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignError implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {

        switch (response.status()){
            case 409:
                return new ConflictException("Erro atributo já existente");
            case 403:
                return new ResourceNotFoundException("Erro atributo não encontrado");
            case 401:
                return new UnauthorizedException("Erro usuário não autorizado");
            default:
                return new BussinesException("Erro de servidor");

        }
    }


}
