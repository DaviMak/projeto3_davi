/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno 63
 */
public class Sexualidade {
    private int idSexo;
    private String dsNomeSexo;
    
    public Sexualidade(int idSexo, String dsNomeSexo){
        this.idSexo = idSexo;
        this.dsNomeSexo = dsNomeSexo;
    }
    public int getIdSexo(){
        return idSexo;
    }
    public void setIdSexo(int idSexo){
        this.idSexo = idSexo;
    }
    public String getDsNomeSexo(){
        return dsNomeSexo;
    }
    public void setDsNomeSexo(String dsNomeSexo){
        this.dsNomeSexo = dsNomeSexo;
    }
}
