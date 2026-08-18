package com.javanauta.bffagendadortarefas.bussines.dto.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TelefoneDTORequest {

    private String numero;
    private String ddd;

}
