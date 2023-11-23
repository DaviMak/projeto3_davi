/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno 63
 */
public class Foto {
    private int idFoto;
    private int idUsuario;
    private String dsFoto;
    
    public Foto(){
    
    }
    public Foto(int idFoto, int idUsuario, String dsFoto){
        this.idFoto = idFoto;
        this.idUsuario = idUsuario;
        this.dsFoto = dsFoto;
    }
    public int getIdFoto(){
        return idFoto;
    }
    public void setIdFoto(int idFoto){
        this.idFoto = idFoto;
    }
    public int getIdUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    public String getDsFoto(){
        return dsFoto;
    }
    public void setDsFoto(String dsFoto){
        this.dsFoto = dsFoto;
    }
}
