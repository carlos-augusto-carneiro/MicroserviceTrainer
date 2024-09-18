package br.com.carlos.microservice.fornecedor.fornecedor.repository;

import br.com.carlos.microservice.fornecedor.fornecedor.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
    @Query("SELECT i FROM Info i WHERE i.estado = :estado")
    Info findByEstado(String estado);
}
