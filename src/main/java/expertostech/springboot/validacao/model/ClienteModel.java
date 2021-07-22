package expertostech.springboot.validacao.model;

import expertostech.springboot.validacao.validation.constraints.PlacaCarro;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class ClienteModel {

    private Integer id;

    @NotBlank(message = "Nome não informado")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "Primeira letra do nome deve ser maiúscula")
    private String nome;

    @Email(message = "E-mail inválido")
    @NotBlank(message = "E-mail não informado")
    private String email;

    @CPF(message = "Número CPF inválido")
    @NotBlank(message = "CPF não informado")
    private String cpf;

    @PlacaCarro
    @NotBlank(message = "Placa não informada")
    private String placaCarro;

}
