package ucu.apps.flowerstorereboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ucu.apps.flowerstorereboot.user.AppUser;

@Repository
public interface AppUserRepository
    extends JpaRepository<AppUser, Integer>{

        @Query
        AppUser findUserByEmail(String email);
}

