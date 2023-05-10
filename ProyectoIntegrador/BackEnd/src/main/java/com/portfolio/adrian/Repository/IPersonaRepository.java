package com.portfolio.adrian.Repository;

import com.portfolio.adrian.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona,Long>{
    
}
