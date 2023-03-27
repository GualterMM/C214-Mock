package br.inatel.cdg;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Webpage {
    HorarioAtendimentoService horarioAtendimentoService;

    public Webpage(HorarioAtendimentoService horarioAtendimentoService){
        this.horarioAtendimentoService = horarioAtendimentoService;
    }

    public HorarioAtendimento buscaHorarioAtendimento(int id) throws RegistroInexistenteException, IDInvalidoException, NumberFormatException, JsonSyntaxException {
        if (id < 0){
            throw new IDInvalidoException("ID inválido.");
        }

        try{
            Gson gson = new Gson();

            String horarioAtendimentoJson = horarioAtendimentoService.buscaPorId(id);
            JsonObject jsonObject = JsonParser.parseString(horarioAtendimentoJson).getAsJsonObject();
            String[] predio = gson.fromJson(jsonObject.get("predio").getAsJsonArray(), String[].class);

            HorarioAtendimento horarioAtendimento = new HorarioAtendimento();
            horarioAtendimento.setId(jsonObject.get("id").getAsInt());
            horarioAtendimento.setNomeDoProfessor(jsonObject.get("nomeDoProfessor").getAsString());
            horarioAtendimento.setHorarioDeAtendimento(jsonObject.get("horarioDeAtendimento").getAsString());
            horarioAtendimento.setPeriodo(jsonObject.get("periodo").getAsString());
            horarioAtendimento.setSala(jsonObject.get("sala").getAsString());
            horarioAtendimento.setPredio(predio[0]);

            return horarioAtendimento;

        } catch (NumberFormatException e) {
            throw e;
        } catch (JsonSyntaxException e){
            throw e;
        }

    }

}
