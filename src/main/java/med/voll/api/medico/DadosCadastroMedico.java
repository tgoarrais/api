package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank // Verifica se o campo não é nulo e nem vazio(obrigatorio)
        String nome,

        @NotBlank
        @Email// verifica se vem no padrão de email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")//passando uma expressão regular para deixar no padrão de 4 a 6 digitos
        String crm,

        @NotNull// verifica se não é nulo, Não usamos NotBlank pq nesse caro não é uma string
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {

}
