public class HorarioAtendimentoConst {
    public static String CHRIS = "{ \"id\":\"1\" \n, " +
            "\"nomeDoProfessor\":\"Christopher Lima\", \n" +
            "\"horarioDeAtendimento\":\"13h30-15h00\", \n" +
            "\"periodo\":\"Integral\", \n" +
            "\"sala\":\"20\", \n" +
            "\"predio\":[\"4\"] }";
    public static String GUILHERME = "{ \"id\":\"2\", \n" +
            "\"nomeDoProfessor\":\"Guilherme Aquino\", \n" +
            "\"horarioDeAtendimento\":\"19h30-21h00\", \n" +
            "\"periodo\":\"Noturno\", \n" +
            "\"sala\":\"4\", \n" +
            "\"predio\":[\"1\"] }";
    public static String VITOR = "{ \"id\":\"3\", \n" +
            "\"nomeDoProfessor\":\"Vitor Figueiredo\", \n" +
            "\"horarioDeAtendimento\":\"08h30-10h00\", \n" +
            "\"periodo\":\"Integral\", \n" +
            "\"sala\":\"10\", \n" +
            "\"predio\":[\"2\"] }";

    public static String MARCELO = "{ \"id\":\"4\", \n" +
            "\"nomeDoProfessor\":\"Marcelo Cysneiros\", \n" +
            "\"horarioDeAtendimento\":\"08h30-10h00\", \n" +
            "\"periodo\":\"Integral\", \n" +
            "\"sala\":\"25\", \n" +
            "\"predio\":[\"6\"] }";
    public static String GENERICO = "{\"id\":\"5\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Noturno\", \n" +
            "\"sala\":\"15\", \n" +
            "\"predio\":[\"3\"] }";
    public static String ID_INVALIDO = "{\"id\":\"-1\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Noturno\", \n" +
            "\"sala\":\"1\", \n" +
            "\"predio\":[\"1\"] }";

    public static String ID_MAL_FORMATADO = "{\"id\":\"ABC\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Noturno\", \n" +
            "\"sala\":\"1\", \n" +
            "\"predio\":[\"1\"] }";

    public static String JSON_MAL_FORMATADO = "{\"numero\":\"901\", \n";

    public static String PERIODO_INVALIDO = "{\"id\":\"902\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"1\", \n" +
            "\"predio\":[\"1\"] }";

    public static String PREDIO_INVALIDO = "{\"id\":\"903\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"25\", \n" +
            "\"predio\":[\"5\"] }";

    public static String SALA_INVALIDA = "{\"id\":\"904\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"30\", \n" +
            "\"predio\":[\"6\"] }";

    public static String SALA_MAL_FORMATADA = "{\"id\":\"905\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"ABC\", \n" +
            "\"predio\":[\"6\"] }";

    public static String PREDIO_MAL_FORMATADO = "{\"id\":\"906\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"30\", \n" +
            "\"predio\":[\"ABC\"] }";

    public static String SALA_PREDIO_INCOERENTES = "{\"id\":\"907\", \n" +
            "\"nomeDoProfessor\":\"Professor Professorson\", \n" +
            "\"horarioDeAtendimento\":\"21h30-23h00\", \n" +
            "\"periodo\":\"Matutino\", \n" +
            "\"sala\":\"10\", \n" +
            "\"predio\":[\"1\"] }";

}
