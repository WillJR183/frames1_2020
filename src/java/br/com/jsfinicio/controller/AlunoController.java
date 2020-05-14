/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.controller;

import br.com.jsfinicio.model.AlunoModel;
import br.com.jsfinicio.repository.AlunoRepository;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class AlunoController {
    
    private AlunoModel alunoModel;
    private AlunoRepository alunoRepository;
    
    public AlunoController(){
        this.alunoModel = new AlunoModel();
        this.alunoRepository = new AlunoRepository();
    }
    
    public void salvar(){
        System.err.println(this.alunoModel.getNome() + "  -  " + this.alunoModel.getRg() + "  -  " + this.alunoModel.getEmail());
        this.alunoRepository.salvar(this.alunoModel);
    }

    public AlunoModel getAlunoModel() {
        return alunoModel;
    }

    public void setAlunoModel(AlunoModel alunoModel) {
        this.alunoModel = alunoModel;
    }

    public AlunoRepository getAlunoRepository() {
        return alunoRepository;
    }

    public void setAlunoRepository(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    
}
