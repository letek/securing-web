package pl.sda.javatarr6.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

//    public ZadanieDto getZadanieById(Long id) {
//
//        ZadanieEntity entity = zadanieRepository.getById(id);
//        ZadanieDto dto = ZadaniaMapper.mapZadanieEntitiesToDto(entity);
//
//        return dto;
//    }


    public ZadanieDto save(ZadanieDto zadanieDto) {

        try {
            ZadanieEntity entity = ZadaniaMapper.mapDtoToZadanieEntity(zadanieDto);
            ZadanieEntity dto = zadanieRepository.save(entity);
            return ZadaniaMapper.mapZadanieEntitiesToDto(dto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //to na develop znacznik
    public ZadanieEntity finishzadanieEntity(Long id) {
        System.out.println("weszlo w finisz");

        if (id != null) {

            System.out.println("weszlo w id <> null");
            System.out.println("id = " + id.toString());
            ZadanieEntity entity = zadanieRepository.getById(id);//ta linijka robi problem

            if (entity != null) {
                System.out.println("weszlo w entity <> null");
                System.out.println(entity);

                entity.setUkonczone(true);
                entity.setDataZamkniecia(new Date());
                zadanieRepository.save(entity);
            }

        } else System.out.println("Nie podano ID");

        //danieEntity(save);
        return null;
    }
}

