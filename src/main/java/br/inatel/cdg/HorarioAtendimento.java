package br.inatel.cdg;

public class HorarioAtendimento {
    private int id;
    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private String sala;
    private String predio;

    public HorarioAtendimento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        if(periodo.equals("Integral") || periodo.equals("Noturno")){
            this.periodo = periodo;
        } else{
            this.periodo = "Inválido";
        }

    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        try{
            if(Integer.parseInt(sala) > 25){
                this.sala = "Inválido";
            } else{
                this.sala = sala;
            }

        } catch (NumberFormatException e){
            throw e;
        }
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        try{
            if(predio.equals("5") || Integer.parseInt(predio) <= 0 || Integer.parseInt(predio) > 6){
                this.predio = "Inválido";
            } else{
                this.predio = predio;
            }

        } catch (NumberFormatException e){
            throw e;
        }

    }

}
