/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.vigenere;

import br.edu.ifpb.seguranca.exception.ChaveVaziaException;
import br.edu.ifpb.seguranca.util.ASCIIAlfabeto;

/**
 *
 * @author emanuel
 */
abstract class TemplateCriptografiaVigenere {

    final String template(String frase, String chave) throws ChaveVaziaException {
        if(chave==null || chave.isEmpty()){
            throw new ChaveVaziaException();
        }
        int countChave = 0;
        StringBuilder novaFrase = new StringBuilder();
        //
        for (int i = 0; i < frase.length(); i++) {
            if (countChave >= chave.length()) {
                countChave = 0;
            }
            //
            int chaveAscii = converterCharParaChave(chave.charAt(countChave++));
            novaFrase.append(novoValor(frase.charAt(i),chaveAscii));
        }
        return novaFrase.toString();
    }

    abstract char novoValor(char caractere, int chave);

    private int converterCharParaChave(char caractere) {
        int numberAscii = caractere;
        //
        if (numberAscii >= ASCIIAlfabeto.NUMBER_ASCII_MIN_MAIUSCULO && numberAscii <= ASCIIAlfabeto.NUMBER_ASCII_MAX_MAIUSCULO) {
            return numberAscii - ASCIIAlfabeto.NUMBER_ASCII_MIN_MAIUSCULO;
        }
        if (numberAscii >= ASCIIAlfabeto.NUMBER_ASCII_MIN_MINUSCULO && numberAscii <= ASCIIAlfabeto.NUMBER_ASCII_MAX_MINUSCULO) {
            return numberAscii - ASCIIAlfabeto.NUMBER_ASCII_MIN_MINUSCULO;
        }
        return 0;
    }
}
