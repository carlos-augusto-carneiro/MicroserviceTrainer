package br.com.carlos.microservice.loja.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompraDTO {

    private List<ItemDaCompraDTO> itens;

    private EnderecoDTO endereco;
}
