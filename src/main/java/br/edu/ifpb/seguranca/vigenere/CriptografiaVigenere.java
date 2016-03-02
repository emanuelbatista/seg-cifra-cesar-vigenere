/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.vigenere;

import br.edu.ifpb.seguranca.cesar.CriptografiaCesar;
import br.edu.ifpb.seguranca.exception.ChaveVaziaException;

/**
 *
 * @author emanuel
 */
public class CriptografiaVigenere extends TemplateCriptografiaVigenere{
    
    private CriptografiaCesar criptografiaCesar;

    public CriptografiaVigenere() {
        criptografiaCesar=new CriptografiaCesar();
    }
    
    public String criptografia(String frase,String chave) throws ChaveVaziaException{
        return template(frase, chave);
    }

    @Override
    char novoValor(char caractere, int chave) {
        String value=criptografiaCesar.criptografar(String.valueOf(caractere), chave);
        return value.charAt(0);
    }
    
}
