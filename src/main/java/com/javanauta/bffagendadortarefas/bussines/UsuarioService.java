package com.javanauta.bffagendadortarefas.bussines;

import com.javanauta.bffagendadortarefas.bussines.dto.in.EnderecoDTORequest;
import com.javanauta.bffagendadortarefas.bussines.dto.in.LoginRequestDTO;
import com.javanauta.bffagendadortarefas.bussines.dto.in.TelefoneDTORequest;
import com.javanauta.bffagendadortarefas.bussines.dto.in.UsuarioDTORequest;
import com.javanauta.bffagendadortarefas.bussines.dto.out.EnderecoDTOResponse;
import com.javanauta.bffagendadortarefas.bussines.dto.out.TelefoneDTOResponse;
import com.javanauta.bffagendadortarefas.bussines.dto.out.UsuarioDTOResponse;
import com.javanauta.bffagendadortarefas.infraestructure.client.UsuarioClient;




import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;


    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest dto){

        return client.salvaUsuario(dto);
    }

    public String loginUsuario(LoginRequestDTO dto){
        return client.login(dto);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token) {
        return  client.buscaUsuarioPorEmail(email, token);
    }


    public void deletaUsuarioPorEmail(String email,String token){
         client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto){
        return client.atualizDadoUsuario(dto,token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest dto, String token){
        return client.atualizaEndereco(dto,idEndereco,token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token){
        return client.atualizaTelefone(dto, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto){
        return client.cadastraTelefone(dto, token);
    }

}
