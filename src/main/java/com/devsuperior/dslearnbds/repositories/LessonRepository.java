package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Enrollment, Long> {
}
