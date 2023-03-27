package br.inatel.cdg;

public interface HorarioAtendimentoService {
    public String buscaPorId(int id) throws RegistroInexistenteException;

}
