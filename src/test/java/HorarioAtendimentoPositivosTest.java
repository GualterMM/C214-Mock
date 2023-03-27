import br.inatel.cdg.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HorarioAtendimentoPositivosTest {
    HorarioAtendimentoService horarioAtendimentoService;
    Webpage webpage;

    @Before
    public void setup(){
        horarioAtendimentoService = new MockHorarioAtendimentoService();
        webpage = new Webpage(horarioAtendimentoService);
    }

    @Test
    public void testeBuscaProfessorChris() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(1);

        assertEquals(1, horarioAtendimento.getId());
        assertEquals("Christopher Lima", horarioAtendimento.getNomeDoProfessor());
        assertEquals("13h30-15h00", horarioAtendimento.getHorarioDeAtendimento());
        assertEquals("Integral", horarioAtendimento.getPeriodo());
        assertEquals("20", horarioAtendimento.getSala());
        assertEquals("4", horarioAtendimento.getPredio());
    }

    @Test
    public void testeBuscaProfessorGuilherme() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(2);

        assertEquals(2, horarioAtendimento.getId());
        assertEquals("Guilherme Aquino", horarioAtendimento.getNomeDoProfessor());
        assertEquals("19h30-21h00", horarioAtendimento.getHorarioDeAtendimento());
        assertEquals("Noturno", horarioAtendimento.getPeriodo());
        assertEquals("4", horarioAtendimento.getSala());
        assertEquals("1", horarioAtendimento.getPredio());
    }

    @Test
    public void testeBuscaProfessorVitor() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(3);

        assertEquals(3, horarioAtendimento.getId());
        assertEquals("Vitor Figueiredo", horarioAtendimento.getNomeDoProfessor());
        assertEquals("08h30-10h00", horarioAtendimento.getHorarioDeAtendimento());
        assertEquals("Integral", horarioAtendimento.getPeriodo());
        assertEquals("10", horarioAtendimento.getSala());
        assertEquals("2", horarioAtendimento.getPredio());
    }

    @Test
    public void testeBuscaProfessorMarcelo() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(4);

        assertEquals(4, horarioAtendimento.getId());
        assertEquals("Marcelo Cysneiros", horarioAtendimento.getNomeDoProfessor());
        assertEquals("08h30-10h00", horarioAtendimento.getHorarioDeAtendimento());
        assertEquals("Integral", horarioAtendimento.getPeriodo());
        assertEquals("25", horarioAtendimento.getSala());
        assertEquals("6", horarioAtendimento.getPredio());
    }

    @Test
    public void testeBuscaProfessorGenerico() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(5);

        assertEquals(5, horarioAtendimento.getId());
        assertEquals("Professor Professorson", horarioAtendimento.getNomeDoProfessor());
        assertEquals("21h30-23h00", horarioAtendimento.getHorarioDeAtendimento());
        assertEquals("Noturno", horarioAtendimento.getPeriodo());
        assertEquals("15", horarioAtendimento.getSala());
        assertEquals("3", horarioAtendimento.getPredio());
    }

    @Test
    public void testeVerificaPredioUm() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(2);

            int sala = Integer.parseInt(horarioAtendimento.getSala());
            int predio = Integer.parseInt(horarioAtendimento.getPredio());

            assertTrue(sala >= 1 && sala <= 5 && predio == 1);
        } catch(NumberFormatException e){
            throw e;
        }
    }

    @Test
    public void testeVerificaPredioDois() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(3);

            int sala = Integer.parseInt(horarioAtendimento.getSala());
            int predio = Integer.parseInt(horarioAtendimento.getPredio());

            assertTrue(sala >= 6 && sala <= 10 && predio == 2);
        } catch(NumberFormatException e){
            throw e;
        }
    }

    @Test
    public void testeVerificaPredioTres() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(5);

            int sala = Integer.parseInt(horarioAtendimento.getSala());
            int predio = Integer.parseInt(horarioAtendimento.getPredio());

            assertTrue(sala >= 11 && sala <= 15 && predio == 3);
        } catch(NumberFormatException e){
            throw e;
        }
    }

    @Test
    public void testeVerificaPredioQuatro() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(1);

            int sala = Integer.parseInt(horarioAtendimento.getSala());
            int predio = Integer.parseInt(horarioAtendimento.getPredio());

            assertTrue(sala >= 16 && sala <= 20 && predio == 4);
        } catch(NumberFormatException e){
            throw e;
        }
    }

    @Test
    public void testeVerificaPredioSeis() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(4);

            int sala = Integer.parseInt(horarioAtendimento.getSala());
            int predio = Integer.parseInt(horarioAtendimento.getPredio());

            assertTrue(sala >= 21 && sala <= 25 && predio == 6);
        } catch(NumberFormatException e){
            throw e;
        }
    }

    @Test
    public void testeVerificaPeriodoCorreto() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(1);

        String periodo = horarioAtendimento.getPeriodo();

        assertEquals("Integral", periodo);
    }

}
