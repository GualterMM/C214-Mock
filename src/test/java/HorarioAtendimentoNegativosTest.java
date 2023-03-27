import br.inatel.cdg.*;
import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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

        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(-12);

        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test(expected = RegistroInexistenteException.class)
    public void testeVerificaRegistroInexistente() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(10);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }
    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoIdMalFormatado() throws RegistroInexistenteException, IDInvalidoException {
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(900);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test(expected = JsonSyntaxException.class)
    public void testeJsonMalFormatado() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(901);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test
    public void testePeriodoInvalido() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(902);

            String periodo = horarioAtendimento.getPeriodo();

            assertEquals("Inválido", periodo);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test
    public void testePredioInvalido() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(903);

            String predio = horarioAtendimento.getPredio();

            assertEquals("Inválido", predio);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test
    public void testeSalaInvalida() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(904);

            String sala = horarioAtendimento.getSala();

            assertEquals("Inválido", sala);
        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoSalaMalFormatado() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(905);

        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

    @Test(expected = NumberFormatException.class)
    public void testeCampoPredioMalFormatado() throws RegistroInexistenteException, IDInvalidoException{
        try {
            HorarioAtendimento horarioAtendimento = webpage.buscaHorarioAtendimento(906);

        } catch (RegistroInexistenteException e) {
            throw e;
        } catch (IDInvalidoException e) {
            throw e;
        }

    }

}
