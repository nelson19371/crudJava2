package com.crudEjemplo.crudEjemplo.Interface;

import com.crudEjemplo.crudEjemplo.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaInterface extends JpaRepository<Persona,Long> {
}
