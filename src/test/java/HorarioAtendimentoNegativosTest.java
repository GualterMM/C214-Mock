import br.inatel.cdg.*;
import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorarioAtendimentoNegativosTest {
    HorarioAtendimentoService horarioAtendimentoService;
    Webpage webpage;

    @Before
    public void setup(){
        horarioAtendimentoService = new MockHorarioAtendimentoService();
        webpage = new Webpage(horarioAtendimentoService);
    }

    @Test(expected = IDInvalidoException.class)
    public void testeCampoIdInvalido() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(-12);
    }

    @Test(expected = RegistroInexistenteException.class)
    public void testeVerificaRegistroInexistente() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(10);
    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoIdMalFormatado() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(900);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    @Test(expected = JsonSyntaxException.class)
    public void testeJsonMalFormatado() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(901);
    }

    @Test
    public void testePeriodoInvalido() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(902);

        String periodo = horarioAtendimento.getPeriodo();

        assertEquals("Inválido", periodo);
    }

    @Test
    public void testePredioInvalido() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(903);

        String predio = horarioAtendimento.getPredio();

        assertEquals("Inválido", predio);
    }

    @Test
    public void testeSalaInvalida() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(904);

        String sala = horarioAtendimento.getSala();

        assertEquals("Inválido", sala);
    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoSalaMalFormatado() throws RegistroInexistenteException, IDInvalidoException, NumberFormatException {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(905);
    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoPredioMalFormatado() throws RegistroInexistenteException, IDInvalidoException, NumberFormatException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(906);
    }

    @Test
    public void testeSalaPredioIncoerentes() throws RegistroInexistenteException, IDInvalidoException {
        HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(907);

        int sala = Integer.parseInt(horarioAtendimento.getSala());
        int predio = Integer.parseInt(horarioAtendimento.getPredio());

        assertFalse(sala >= 6 && sala <= 10 && predio == 2);
    }

}
