package pl.sda.javatarr6.demo.mapper;

//import pl.sda.javatarr6.demo.dto.ItemDto;

import pl.sda.javatarr6.demo.dto.ZadanieDto;
import pl.sda.javatarr6.demo.entity.ZadanieEntity;

import java.util.ArrayList;
import java.util.List;

//import pl.sda.javatarr6.demo.entity.ZadanieEntity;

//import java.util.List;

public class ZadaniaMapper {

    public static List<ZadanieDto> mapZadaniaEntitiesToDto(Iterable<ZadanieEntity> entities) {

        List<ZadanieDto> zadania = new ArrayList<>();

        for (ZadanieEntity entity : entities) {

            ZadanieDto dto = new ZadanieDto(entity.getId(),entity.getOpis());
            System.out.println("Zadanie Mapper: "+entity.getOpis());
            zadania.add(dto);
        }
        //System.out.println("sout z Zadanie Mapper");

        return zadania;
    }
}
