package com.exemplo.boleto.apifatura.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString

public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O banco deve conter 16 números")
    private String numeroCartao;

    @NotBlank(message = "O nome do pagador não pode estar em branco")
    @Size(min = 3, max = 100, message = "O nome deve possuir entre 10 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.00", message = "O valor mínimo é 10.00 centavo")
    @DecimalMax(value = "5000.00", message = "O valor máximo é 5000.00")
    private Double valor;

    @NotNull(message = "A data não pode ser nula")
    @FutureOrPresent(message = "A data de vencimento deve ser a data atual ou uma data futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "Ele deve ser um email válido")
    private String emailContato;

}
