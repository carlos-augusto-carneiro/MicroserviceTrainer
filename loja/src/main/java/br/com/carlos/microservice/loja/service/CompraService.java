package br.com.carlos.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.carlos.microservice.loja.dto.CompraDTO;
import br.com.carlos.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO){
        RestTemplate clienteRest = new RestTemplate();   
        clienteRest.exchange("http://localhost:8081/info/"+compraDTO.getEndereco().getEstado(),
                            HttpMethod.GET, null, InfoFornecedorDTO.class);
    }
}
