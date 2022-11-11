package Sqls;

public class infosql {
    public static final String find_by_infos = """
            SELECT
                *
            FROM
                LK.INFOS  
            """;

    public static final String inser_infos = """
            INSERT INTO
               LK.INFOS (NOME, IDADE, EMAIL, ENDERECO)
            VALUES
                (:NOME, :IDADE, :EMAIL, :ENDERECO);
            """;
}
