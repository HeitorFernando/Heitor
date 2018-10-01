/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heitor;

/**
 *
 * @author User
 */
public class Disciplina {
    private String descricao;
    private String sigla;
    private String periodo;
    private int quantidadeDeCreditos;

    public Disciplina(String descricao, String sigla, String periodo, int quantidadeDeCreditos) {
        this.descricao = descricao;
        this.sigla = sigla;
        this.periodo = periodo;
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getQuantidadeDeCreditos() {
        return quantidadeDeCreditos;
    }

    public void setQuantidadeDeCreditos(int quantidadeDeCreditos) {
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "descricao=" + descricao + ", sigla=" + sigla + ", periodo=" + periodo + ", quantidadeDeCreditos=" + quantidadeDeCreditos + '}';
    }
    
}
