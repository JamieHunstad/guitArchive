package com.guitarchive.guitarchive.repo;

import com.guitarchive.guitarchive.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuitarRepo extends JpaRepository<Guitar, Long> {
    void deleteGuitarById(Long id);

    Optional<Guitar> findGuitarById(Long id);
}
