package com.work.repository;

import com.work.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    @Query(value = "SELECT name FROM user WHERE name= :name", nativeQuery = true)
    String getUserName(@Param("name") String name);

    @Query(value = "SELECT password FROM user WHERE name= :name", nativeQuery = true)
    String getUserPassword(@Param("name") String name);

    @Query(value = "SELECT * FROM user WHERE name = :name", nativeQuery = true)
    User getUserDetails(@Param("name") String name);

    @Modifying
    @Query(value = "INSERT INTO user(name,password) VALUES" +
            "(:name, :hash_password)", nativeQuery = true)
    @Transactional
    void signupUser(@Param("name") String name,
                    @Param("hash_password") String hash_password);
}
