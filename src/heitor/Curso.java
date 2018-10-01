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
public class Curso {
    private int cod_Curso;
    private String descricao;
    private int duracao;

    public Curso(int cod_Curso, String descricao, int duracao) {
        this.cod_Curso = cod_Curso;
        this.descricao = descricao;
        this.duracao = duracao;
    }
    public Curso(String descricao) {
        this.descricao = descricao;
    }

    public int getCod_Curso() {
        return cod_Curso;
    }

    public void setCod_Curso(int cod_Curso) {
        this.cod_Curso = cod_Curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod_Curso=" + this.cod_Curso + ", descricao=" + this.descricao + ", duracao=" + this.duracao + '}';
    }
    
}
