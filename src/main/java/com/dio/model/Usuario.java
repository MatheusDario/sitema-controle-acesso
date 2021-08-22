package com.dio.model;

import lombok.*;

import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    @ManyToMany
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToMany
    private Empresa empresa;
    @ManyToMany
    private NivelAcesso nivelAcesso;
    @ManyToMany
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
