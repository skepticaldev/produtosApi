package br.com.cotiinformatica.entities;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categoria {

    private UUID id;
    private String nome;
    private List<Produto> produtos;
}
