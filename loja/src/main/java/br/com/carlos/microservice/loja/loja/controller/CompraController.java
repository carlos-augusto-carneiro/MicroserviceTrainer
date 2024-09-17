package br.com.carlos.microservice.loja.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.microservice.loja.loja.dto.CompraDTO;
import br.com.carlos.microservice.loja.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO compraDTO){
        compraService.realizaCompra(compraDTO);
    }

}
