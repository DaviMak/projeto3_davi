/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Cadastro;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 63
 */
public class UsuarioDao {
    private ConexaoBanco conexao;
    
    public UsuarioDao() {
        this.conexao = new ConexaoBanco();
    }
    
    public boolean inserir(Cadastro cadastro) {
        String sql = "INSERT INTO tbCadastro (dsNome, dsCep, dsRua, dsBairro, DsCidade, dsCpf, dsEmail) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1, cadastro.getDsNome());
                sentenca.setString(2, cadastro.getDsCep());
                sentenca.setString(3, cadastro.getDsRua());
                sentenca.setString(4, cadastro.getDsBairro());
                sentenca.setString(5, cadastro.getDsCidade());
                sentenca.setString(6, cadastro.getDsCpf());
                sentenca.setString(7, cadastro.getDsEmail());

                int linhasAfetadas = sentenca.executeUpdate();

                sentenca.close();
                this.conexao.getConnection().close();

                return linhasAfetadas > 0;
            }else{
                JOptionPane.showMessageDialog(null, "eita!");
            }

            return false; 
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
     public ArrayList<Cadastro> consultar(int idUsuario) {
    ArrayList<Cadastro> Cadastro = new ArrayList<Cadastro>();
    String sql = "SELECT * " +
                 "FROM tbCadastro";
};