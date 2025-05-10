package org.example.btvnonkiemtra.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.btvnonkiemtra.constant.ErrorMessage;
import org.example.btvnonkiemtra.domain.dto.reponse.ResponseUserDTO;
import org.example.btvnonkiemtra.domain.dto.request.RequestUserDTO;
import org.example.btvnonkiemtra.domain.entity.Users;
import org.example.btvnonkiemtra.domain.exception.NotFoundException;
import org.example.btvnonkiemtra.domain.mapper.UserMapper;
import org.example.btvnonkiemtra.domain.repository.UserRepository;
import org.example.btvnonkiemtra.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public ResponseUserDTO createUser(RequestUserDTO requestUserDTO) {
        Users user = userMapper.toUser(requestUserDTO);
        Users saveUser = userRepository.save(user);
        return userMapper.toResponseUserDTO(saveUser);
    }

    @Override
    public ResponseUserDTO updateUser(ResponseUserDTO responseUserDTO) {
        Users users = userRepository.findById(responseUserDTO.getId()).get();
        users.setUsername(responseUserDTO.getUsername());
        users.setPassword(responseUserDTO.getPassword());
        users.setEmail(responseUserDTO.getEmail());
        users.setCreateAt(responseUserDTO.getCreatedAt());
        Users updateUser = userRepository.save(users);
        return userMapper.toResponseUserDTO(updateUser);
    }

    @Override
    public void deleteUser(int id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

    @Override
    public List<ResponseUserDTO> getAllUsers() {
        return userMapper.toResponseUserDTOList(userRepository.findAll());
    }

    @Override
    public ResponseUserDTO getUserById(int id) {
        Users user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Users.ERR_NOT_FOUND_ID));
        return userMapper.toResponseUserDTO(user);
    }
}
