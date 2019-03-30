package ee.taltech.spring.bookit.repository;

import ee.taltech.spring.bookit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Pärib andmebaasist andmeid
    //JPA Oskab ise eos mingeid päringuid teha.
    //User findByAgeIs(int age);
}
