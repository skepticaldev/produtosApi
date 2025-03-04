package br.com.cotiinformatica.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    @Operation(summary = "Serviço para cadastro de produtos.")
    @PostMapping("cadastrar")
    public void cadastrar(){
    }

    @Operation(summary = "Serviço para atualização de dados de produto.")
    @PutMapping("atualizar")
    public void atualizar(){

    }

    @Operation(summary = "Serviço para exclusão de um produto.")
    @DeleteMapping("excluir")
    public void excluir(){
    }

    @Operation(summary = "Serviço para consulta de todos os produtos.")
    @GetMapping("consultar")
    public void consultar(){}
}
