package domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "INFORMACOES")
@Data
@Builder
public class MdDomain {
    @Id
    @Column(name = "nome")
    public String nome;
    @Column(name = "idade")
    public Integer idade;
    @Column(name = "somaDtNasc")
    public Integer somaDtNasc;

    @Column(name = "email")
    public String email;

    @Column(name = "endereco")
    public String endereco;

    @Column(name = "code")
    public Integer code;
}
