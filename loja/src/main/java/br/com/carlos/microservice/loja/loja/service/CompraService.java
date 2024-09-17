package br.com.carlos.microservice.loja.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.carlos.microservice.loja.loja.dto.CompraDTO;
import br.com.carlos.microservice.loja.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO){

        RestTemplate clienteRest = new RestTemplate();   
        ResponseEntity<InfoFornecedorDTO> exchange = clienteRest.exchange("http://fornecedor/info/"+compraDTO.getEndereco().getEstado(),
                            HttpMethod.GET, null, InfoFornecedorDTO.class);

        InfoFornecedorDTO infoFornecedor = exchange.getBody();
        if (infoFornecedor != null) {
            System.out.println(infoFornecedor.getEndereco());
        } else {
            System.out.println("Informações do fornecedor não disponíveis");
        }
    }
}
