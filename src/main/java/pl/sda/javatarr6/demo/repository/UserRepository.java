package pl.sda.javatarr6.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.javatarr6.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    //List<User> getAllByDate(Date date);
}