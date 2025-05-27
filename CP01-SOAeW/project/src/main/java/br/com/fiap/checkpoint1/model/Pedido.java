package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório")
    private String clienteName;

    private LocalDate dataPedido;

    @PositiveOrZero(message = "O valor total do pedido não pode ser negativo")
    private Double valorTotal;

    @PrePersist
    public void prePersist() {
        dataPedido = LocalDate.now();
    }
}