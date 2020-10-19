package pl.sda.javatarr6.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.sda.javatarr6.demo.entity.ZadanieEntity;
import pl.sda.javatarr6.demo.repository.ZadaniaRepository;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    private ZadaniaRepository zadaniaRepository;

    @Override
    public void run(ApplicationArguments args) throws  Exception {

        ZadanieEntity zadanieEntity = new ZadanieEntity("jnowak" );
        zadaniaRepository.save(zadanieEntity);
        ZadanieEntity zadanieEntity2 = new ZadanieEntity("jnowak2" );
        zadaniaRepository.save(zadanieEntity2);
        ZadanieEntity zadanieEntity3 = new ZadanieEntity("jkazikowski" );
        zadaniaRepository.save(zadanieEntity3);

//        zadaniaRepository.save(user);
//
//        for (int i = 1; i <= 15; i++) {
//            insertTodo(i, false, user);
//            insertTodo(i, true, user);
//        }
    }
}
