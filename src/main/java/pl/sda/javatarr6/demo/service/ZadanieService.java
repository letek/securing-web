package pl.sda.javatarr6.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.util.List;

import pl.sda.javatarr6.demo.dto.ZadanieDto;
import pl.sda.javatarr6.demo.entity.ZadanieEntity;
import pl.sda.javatarr6.demo.mapper.ZadaniaMapper;
import pl.sda.javatarr6.demo.repository.ZadanieRepository;

@Service
public class ZadanieService {

    @Autowired
    private ZadanieRepository zadanieRepository;

    public List<ZadanieDto> getAll() {

        Iterable<ZadanieEntity> entities = zadanieRepository.findAll();
        List<ZadanieDto> dtos = ZadaniaMapper.mapZadanieEntitiesToDto(entities);

        return dtos;
    }

    public ZadanieDto getQuizById(Long id) {

        ZadanieEntity entity = zadanieRepository.getById(id);
        ZadanieDto dto = ZadaniaMapper.mapZadanieEntitiesToDto(entity);

        return dto;
    }

    public ZadanieDto save(ZadanieDto zadanieDto) {

        try {
            ZadanieEntity entity = ZadaniaMapper.mapDtoToZadanieEntity(zadanieDto);
            ZadanieEntity dto = zadanieRepository.save(entity);
                    //save(entity);

            return ZadaniaMapper.mapZadanieEntitiesToDto(dto);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}

