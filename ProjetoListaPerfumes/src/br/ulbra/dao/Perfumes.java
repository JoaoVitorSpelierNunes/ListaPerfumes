package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Perfumes {
    ArrayList listaPerfumes;
    
    public Perfumes() {
        listaPerfumes = new ArrayList();
    }
    
    public void salvar(String perfume) {
        listaPerfumes.add(perfume);
        JOptionPane.showMessageDialog(null, "Perfume salvo com sucesso!");
    }
    
    public String listar() {
        String res = "";
        if(listaPerfumes.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sua lista de perfumes encontra-se vazia");
        }
        else
        {
            for(int i=0; i < listaPerfumes.size(); i++)
            {
                res += (i + 1) + " - " + listaPerfumes.get(i)+"\n";
            }
        }
        return res;
    }
    
    public void remover(int i) {
        if(listaPerfumes.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Impossível excluir, lista vazia!");
        }
        else
        {
            if((i - 1)>=0 && (i - 1)<listaPerfumes.size())
            {
                listaPerfumes.remove(i - 1);
                JOptionPane.showMessageDialog(null, "Foi removido com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Este item não existe!");
            }
        }
    }
    
    public void alterar(int i, String novo) {
        if(listaPerfumes.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Impossível alterar, lista vazia!");
        }
        else
        {
            if((i - 1)>=0 && (i - 1)<listaPerfumes.size())
            {
                listaPerfumes.set((i - 1), novo);
                JOptionPane.showMessageDialog(null, "Seu item foi alterado com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Este item não existe!");
            }
        }
    }
    
    public String pesquisar(String pesquisa) {
        String verificar = null;
        for(int i = 0; i < listaPerfumes.size(); i++) {
            if(listaPerfumes.get(i).equals(pesquisa)) {
                verificar = (String) listaPerfumes.get(i);
                break;
            }
        }
        if (verificar!=null){
            return verificar;
        } 
        else {
            verificar = "Este item não existe!";
            return verificar;
        }
    }
    
    public void ordenar() {
        Collections.sort(listaPerfumes);
    }
}
