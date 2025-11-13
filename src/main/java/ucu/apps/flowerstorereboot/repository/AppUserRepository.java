package ucu.apps.flowerstorereboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ucu.apps.flowerstorereboot.user.AppUser;

@Repository
public interface AppUserRepository
    extends JpaRepository<AppUser, Integer>{

        @Query("SELECT u FROM app_user u WHERE u.email = ?1")
        Optional<AppUser> findUserByEmail(String email);
}

