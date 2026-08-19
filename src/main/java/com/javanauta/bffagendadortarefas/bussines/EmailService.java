package com.javanauta.bffagendadortarefas.bussines;

import com.javanauta.bffagendadortarefas.bussines.dto.out.TarefasDTOResponse;
import com.javanauta.bffagendadortarefas.infraestructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }
}
