/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.vigenere;

import br.edu.ifpb.seguranca.cesar.DescriptografiaCesar;
import br.edu.ifpb.seguranca.exception.ChaveVaziaException;

/**
 *
 * @author emanuel
 */
public class DescriptografiaVigenere extends TemplateCriptografiaVigenere{
    
    private DescriptografiaCesar descriptografiaCesar;

    public DescriptografiaVigenere() {
        this.descriptografiaCesar=new DescriptografiaCesar();
    }
    
    
    public String descriptografia(String frase,String chave) throws ChaveVaziaException{
       return template(frase, chave);
    }
    

    @Override
    char novoValor(char caractere, int chave) {
        String valor=descriptografiaCesar.descriptograr(String.valueOf(caractere), chave);
        return valor.charAt(0);
    }
    
}
