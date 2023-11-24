package Dao;

import java.util.ArrayList;

public interface DaoGenerica<ObjetoGenerico> {
    
    public void inserir(ObjetoGenerico objt);
    
    public void alterar(ObjetoGenerico objt);
    
    public void excluir();
    
    public void atualizar();
    
    public ArrayList<ObjetoGenerico> consultar();

    public ArrayList<ObjetoGenerico> dashboard();    
    
}