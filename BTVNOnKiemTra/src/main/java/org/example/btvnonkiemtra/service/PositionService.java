package org.example.btvnonkiemtra.domain.service;

import org.example.btvnonkiemtra.domain.dto.reponse.ResponseDepartmentDTO;
import org.example.btvnonkiemtra.domain.dto.reponse.ResponsePositionDTO;
import org.example.btvnonkiemtra.domain.dto.request.RequestPositionDTO;

import java.util.List;

public interface PositionService {
    ResponsePositionDTO createPosition(ResponsePositionDTO responsePositionDTO);
    ResponsePositionDTO updatePosition(ResponsePositionDTO responsePositionDTO);
    ResponsePositionDTO getPositionById(int id);
    List<ResponsePositionDTO> getAllPositions();
    void deletePositionById(int id);
}
