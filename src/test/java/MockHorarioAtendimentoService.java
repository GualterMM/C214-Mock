import br.inatel.cdg.HorarioAtendimentoService;
import br.inatel.cdg.RegistroInexistenteException;

public class MockHorarioAtendimentoService implements HorarioAtendimentoService {
    @Override
    public String buscaPorId(int id) throws RegistroInexistenteException {
        if(id == 1){
            return HorarioAtendimentoConst.CHRIS;
        } else if(id == 2){
            return HorarioAtendimentoConst.GUILHERME;
        } else if(id == 3){
            return HorarioAtendimentoConst.VITOR;
        } else if(id == 4){
            return HorarioAtendimentoConst.MARCELO;
        } else if(id == 5){
            return HorarioAtendimentoConst.GENERICO;
        }  else if (id < 0){
            return HorarioAtendimentoConst.ID_INVALIDO;
        } else if(id == 900){
            return HorarioAtendimentoConst.ID_MAL_FORMATADO;
        } else if(id == 901){
            return HorarioAtendimentoConst.JSON_MAL_FORMATADO;
        } else if(id == 902){
            return HorarioAtendimentoConst.PERIODO_INVALIDO;
        } else if(id == 903){
            return HorarioAtendimentoConst.PREDIO_INVALIDO;
        } else if(id == 904){
            return HorarioAtendimentoConst.SALA_INVALIDA;
        } else if(id == 905){
            return HorarioAtendimentoConst.SALA_MAL_FORMATADA;
        } else if(id == 906){
            return HorarioAtendimentoConst.PREDIO_MAL_FORMATADO;
        } else if(id == 907){
            return HorarioAtendimentoConst.SALA_PREDIO_INCOERENTES;
        } else {
            throw new RegistroInexistenteException("Registro inexistente.");
        }

    }
}
