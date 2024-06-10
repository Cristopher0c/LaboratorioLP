package com.example.ExamenL1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ExamenL1.model.Baño;

@Repository
public interface IBañoRepository extends JpaRepository<Baño, Integer>{

}
