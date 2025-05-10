package org.example.btvnonkiemtra.domain.service;

import org.apache.catalina.User;
import org.example.btvnonkiemtra.domain.dto.reponse.ResponseUserDTO;
import org.example.btvnonkiemtra.domain.dto.request.RequestUserDTO;

import java.util.List;

public interface UserService {
    ResponseUserDTO createUser(RequestUserDTO requestUserDTO);
    ResponseUserDTO updateUser(ResponseUserDTO responseUserDTO);
    void deleteUser(int id);
    List<ResponseUserDTO> getAllUsers();
    ResponseUserDTO getUserById(int id);
}
