package br.com.carlos.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.carlos.microservice.loja.dto.CompraDTO;
import br.com.carlos.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO){

        RestTemplate clienteRest = new RestTemplate();   
        ResponseEntity<InfoFornecedorDTO> exchange = clienteRest.exchange("http://localhost:8081/info/"+compraDTO.getEndereco().getEstado(),
                            HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
