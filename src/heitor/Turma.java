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
public class Turma {
    private String identificador;
    private String anoDeOferta;

    public Turma(String identificador, String anoDeOferta) {
        this.identificador = identificador;
        this.anoDeOferta = anoDeOferta;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAnoDeOferta() {
        return anoDeOferta;
    }

    public void setAnoDeOferta(String anoDeOferta) {
        this.anoDeOferta = anoDeOferta;
    }

    @Override
    public String toString() {
        return "Turma{" + "identificador=" + this.identificador + ", anoDeOferta=" + this.anoDeOferta + '}';
    }
    
    
}
