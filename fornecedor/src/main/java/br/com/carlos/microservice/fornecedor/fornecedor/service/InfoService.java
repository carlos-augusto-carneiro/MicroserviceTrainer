package br.com.carlos.microservice.fornecedor.fornecedor.service;

import br.com.carlos.microservice.fornecedor.fornecedor.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.carlos.microservice.fornecedor.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
    @Autowired
    private InfoRepository infoRepository;

    public Info getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
