package sqls;

public class infosql {
    public static final String find_by_informacoes = """
            SELECT
                *
            FROM
                lk.informacoes;
            """;

    public static final String inser_informacoes = """
            INSERT INTO
               lk.informacoes (nome, idade, email, endereco, somaDtNasc)
            VALUES
                (:nome, :idade, :email, :endereco, :somaDtNasc);
            """;
}
