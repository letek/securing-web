package pl.sda.javatarr6.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.javatarr6.demo.entity.ZadanieEntity;

import java.util.List;

@Repository
public interface ZadaniaRepository extends CrudRepository<ZadanieEntity, Long> {
    //List<Zadanie> getAllByDate(Date date);


}