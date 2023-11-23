/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno 63
 */
public class Cadastro {
    private int idCadastro;
    private String dsCep;
    private String dsBairro;
    private String dsRua;
    private String dsUf;
    private String dsCidade;
    private String dsNome;
    private String dsCpf;
    private String dsEmail;
    private int dsSexo;
    private String ftFoto;
    
    public Cadastro(){
    
    }
    public Cadastro(int idCadastro, String dsCep, String dsBairro, String dsRua, String dsUf, String dsCidade, int dsSexo, String ftFoto){
        this.idCadastro = idCadastro;
        this.dsCep = dsCep;
        this.dsBairro = dsBairro;
        this.dsRua = dsRua;
        this.dsUf = dsUf;
        this.dsCidade = dsCidade;
        this.dsSexo = dsSexo;
        this.ftFoto = ftFoto;
    }
    public int getIdCadastro(){
        return idCadastro;
    }
    public void setIdCadastro(int idCadastro){
        this.idCadastro = idCadastro;
    }
    public String getDsCep(){
        return dsCep;
    }
    public void setDsCep(String dsCep){
        this.dsCep = dsCep;
    }
    public String getDsBairro(){
        return dsBairro;
    }
    public void setDsBairro(String dsBairro){
        this.dsBairro = dsBairro;
    }
    public String getDsRua(){
        return dsRua;
    }
    public void setDsRua(String dsRua){
        this.dsRua = dsRua;
    }
    public String getDsUf(){
        return dsUf;
    }
    public void setDsUf(String dsUf){
        this.dsUf = dsUf;
    }
    public String getDsCidade(){
        return dsCidade;
    }
    public void setDsCidade(String dsCidade){
        this.dsCidade = dsCidade;
    }
    public String getDsNome(){
        return dsNome;
    }
    public void setDsNome(String dsNome){
        this.dsNome = dsNome;
    }
    public String getDsCpf(){
        return dsCpf;
    }
    public void setDsCpf(String dsCpf){
        this.dsCpf = dsCpf;
    }
    public String getDsEmail(){
        return dsEmail;
    }
    public void setDsEmail(String dsEmail){
        this.dsEmail = dsEmail;
    }
    public int getDsSexo(){
        return dsSexo;
    }
    public void setDsSexo(int dsSexo){
        this.dsSexo = dsSexo;
    }
    public String getFtFoto(){
        return ftFoto;
    }
    public void setFtFoto(String ftFoto){
        this.ftFoto = ftFoto;
    }
}
