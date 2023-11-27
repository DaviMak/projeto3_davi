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
import java.sql.ResultSet;

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
            if (conexao.conectar()) {
                PreparedStatement sentenca = conexao.getConnection().prepareStatement(sql);
               // ResultSet rs = sentenca.executeQuery();
                
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
     public ArrayList<Cadastro> consultar() {
    
        String sql = "SELECT * FROM tbCadastro";
         ArrayList<Cadastro> listaCadastros = new ArrayList<Cadastro>();
         
         try{
             if(conexao.conectar()){
                 PreparedStatement sentenca = conexao.getConnection().prepareStatement(sql);
                 ResultSet resultado = sentenca.executeQuery();
                 
                 while(resultado.next()){
                     Cadastro cadastro = new Cadastro();
                     
                     cadastro.setIdCadastro(resultado.getInt("idCadastro"));
                     cadastro.setDsNome(resultado.getString("dsNome"));
                     cadastro.setDsEmail(resultado.getString("dsEmail"));
                     cadastro.setDsCidade(resultado.getString("dsCidade"));
                     cadastro.setDsCpf(resultado.getString("dsCpf"));
                     
                     listaCadastros.add(cadastro);
                 }
                 
                 sentenca.close();
                 this.conexao.getConnection().close();
                 
                 return listaCadastros;
             }
             
             return null;
         }catch(SQLException ex){
             throw new RuntimeException(ex);
         }
     }
     public void Excluir(int idCadastro) throws SQLException{
         String sql = "DELETE FROM tbCadastro  WHERE idCadastro = ?";
         
             if(this.conexao.conectar()){
                 PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                 
                 sentenca.setInt(1, idCadastro);
                 
                 sentenca.execute();
                 sentenca.close();
                 this.conexao.getConnection().close();
             }
         }
}






//                this.conexao.getConnection().close();
//                
//                return listaConsultas;
//            }
//
//            return null; 
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
