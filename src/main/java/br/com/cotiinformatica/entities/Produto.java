package br.com.cotiinformatica.entities;

import lombok.*;

import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {
    private UUID id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Categoria categoria;
}
