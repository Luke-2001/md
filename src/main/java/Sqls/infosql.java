package Sqls;

public class infosql {
    public static final String find_by_informacoes = """
            SELECT
                *
            FROM
                informacoes;
            """;

    public static final String inser_informacoes = """
            INSERT INTO
               informacoes (nome, idade, email, endereco, somaDtNasc)
            VALUES
                (:nome, :idade, :email, :endereco, :somaDtNasc);
            """;
}
