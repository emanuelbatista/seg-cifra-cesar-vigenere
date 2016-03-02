/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.vigenere;

import br.edu.ifpb.seguranca.exception.ChaveVaziaException;

/**
 *
 * @author emanuel
 */
public class CifraVigenere {

    private CriptografiaVigenere criptografiaVigenere;
    private DescriptografiaVigenere descriptografiaVigenere;

    public CifraVigenere() {
        this.criptografiaVigenere = new CriptografiaVigenere();
        this.descriptografiaVigenere = new DescriptografiaVigenere();
    }

    public String criptografar(String frase, String chave) throws ChaveVaziaException {
        return criptografiaVigenere.criptografia(frase, chave);
    }

    public String descriptografar(String frase, String chave) throws ChaveVaziaException {
         return descriptografiaVigenere.descriptografia(frase, chave);
    }

}
