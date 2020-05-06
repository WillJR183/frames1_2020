/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.repository;

import br.com.jsfinicio.model.AlunoModel;
import br.com.jsfinicio.util.Conexao;

/**
 *
 * @author Frank
 */
public class AlunoRepository extends Conexao{
    public void salvar(AlunoModel alunoModel){
        super.inicializa();
        super.getSess().save(alunoModel);
        super.executar();
    }
}
