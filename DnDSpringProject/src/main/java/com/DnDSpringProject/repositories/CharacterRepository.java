package com.DnDSpringProject.repositories;

import com.DnDSpringProject.models.Character;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    Character findById(long id);

    @Query("from Ad a where a.title like %:term%")
    Character findByTitle(String term);
}