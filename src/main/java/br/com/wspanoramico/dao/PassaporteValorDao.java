/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wspanoramico.dao;

import br.com.wspanoramico.model.Passaportevalor;
import javax.ejb.Stateless;

@Stateless
public class PassaporteValorDao extends AbstractDao<Passaportevalor>{
    
    public PassaporteValorDao() {
        super(Passaportevalor.class);
    }
    
}
