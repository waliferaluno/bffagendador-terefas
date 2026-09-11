package com.javanauta.bffagendadortarefas.infraestructure.client;

import com.javanauta.bffagendadortarefas.bussines.dto.in.*;
import com.javanauta.bffagendadortarefas.bussines.dto.out.EnderecoDTOResponse;
import com.javanauta.bffagendadortarefas.bussines.dto.out.TarefasDTOResponse;
import com.javanauta.bffagendadortarefas.bussines.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendadortarefas.bussines.dto.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    @PostMapping
    void enviarEmail(@RequestBody TarefasDTOResponse dto);

}
