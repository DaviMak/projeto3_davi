/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno 64
 */
public class ConexaoBanco {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public ConexaoBanco(){
        this.servidor = "200.195.178.52";
        this.banco = "grupo4_projeto2_davi";
        this.usuario = "grupo4";
        this.senha = "xpJHCEEGbU4mSys2";
    }
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco, this.usuario, this.senha);
            return true;
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection(){
        return conexao;
    }
}

