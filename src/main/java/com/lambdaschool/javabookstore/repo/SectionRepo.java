package com.lambdaschool.javabookstore.repo;

import com.lambdaschool.javabookstore.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepo extends JpaRepository<Section, Long> {
}
