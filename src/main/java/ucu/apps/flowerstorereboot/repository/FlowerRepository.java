package ucu.apps.flowerstorereboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ucu.apps.flowerstorereboot.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
}

