package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Section, Long> {
}
