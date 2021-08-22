package com.dio.model;

import lombok.*;

import javax.persistence.ManyToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @ManyToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
