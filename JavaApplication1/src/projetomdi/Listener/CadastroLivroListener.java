/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetomdi.Frames.Cadastro;
import projetomdi.Frames.CadastroLivros;

/**
 *
 * @author comp8
 */
public class CadastroLivroListener implements ActionListener{

    private CadastroLivros cadLivro;

    public CadastroLivroListener(CadastroLivros cadLivro) {
        this.cadLivro = cadLivro;
    }

    public void actionPerformed(ActionEvent e) {
        if ("limpar".equals(e.getActionCommand())) {
            cadLivro.limpar();
        } else if ("sair".equals(e.getActionCommand())) {
            cadLivro.sair();
        } else if ("salvar".equals(e.getActionCommand())) {
            cadLivro.salvar();
        }
    }
}
