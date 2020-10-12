package pl.sda.javatarr6.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javatarr6.demo.dto.ZadanieDto;
import pl.sda.javatarr6.demo.entity.ZadanieEntity;
import pl.sda.javatarr6.demo.mapper.ZadaniaMapper;
import pl.sda.javatarr6.demo.repository.ZadaniaRepository;

import java.util.List;

//import java.util.Date;

@Service
public class ZadaniaService {

    @Autowired
    private ZadaniaRepository zadaniaRepository;

    public List<ZadanieDto> getAll() {

        Iterable<ZadanieEntity> entities = zadaniaRepository.findAll();
        List<ZadanieDto> zadania = ZadaniaMapper.mapZadaniaEntitiesToDto(entities);
        System.out.println("sout z ZadaniaService");
        return zadania;
    }

//    public List<ItemDto> getAllByDate(Date date) {
//        Iterable<ItemEntity> entities = itemsRepository.getAllByDate(date);
//        List<ItemDto> items = ItemsMapper.mapEntitiesToDto(entities);
//
//        return items;
//    }
}
