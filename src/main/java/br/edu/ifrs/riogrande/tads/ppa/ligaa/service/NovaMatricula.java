package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

public class NovaMatricula {
    private String cpfAluno;
    private int turmaId;

    public int getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }
}
