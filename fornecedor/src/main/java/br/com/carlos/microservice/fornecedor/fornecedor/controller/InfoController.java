package br.com.carlos.microservice.fornecedor.fornecedor.controller;

import java.lang.ProcessHandle.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.microservice.fornecedor.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;
    
    @RequestMapping("/{estado}")
    public Info getInfoPorEstado(@PathVariable String estado){
        return infoService.getInfoPorEstado(estado);
    }
}
