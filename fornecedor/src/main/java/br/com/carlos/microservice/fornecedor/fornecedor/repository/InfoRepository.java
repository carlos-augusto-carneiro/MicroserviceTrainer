package br.com.carlos.microservice.fornecedor.fornecedor.repository;

import java.lang.ProcessHandle.Info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long>{

    @Query("Select i from Info i where i.estado = estado")
    Info findByEstado(String estado);
}
