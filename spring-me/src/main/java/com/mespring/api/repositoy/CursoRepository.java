package com.mespring.api.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mespring.api.model.Curso;
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
