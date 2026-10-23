package com.gerenciadorPet.service;


import com.gerenciadorPet.dto.user.*;
import com.gerenciadorPet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AdminService {

    private final UserRepository userRepository;

    /*
    ============================================
                 FUNÇÕES DO ADMIN
    ============================================
    Não tem permissão para mexer nos pets só nos usuarios,
    se deletar vai ter q rolar cascade btw
     */

    //Criar Usuarios manual
    public UserResponse createUser(UserRequest newUser) {

    }

    //Listar Usuarios
    //Editar Perfis
    //Atualizar perfis
    //Desativar Perfis


    /*
    ============================================
              CONTROLE DE SENHAS
    ============================================
    Admin pode ter a possibilidade de trocar senha de usuarios tb
     */
}
