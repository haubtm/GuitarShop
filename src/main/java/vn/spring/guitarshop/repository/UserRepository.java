package vn.spring.guitarshop.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import vn.spring.guitarshop.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    User findById(long id);

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
