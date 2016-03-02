/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.cesar;

import br.edu.ifpb.seguranca.util.ASCIIAlfabeto;

/**
 *
 * @author emanuel
 */
public abstract class TemplateCriptografiaCesar {

    public final String template(String frase,int chave) {
        StringBuilder novaFrase = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            int asciiNumber = frase.charAt(i);
            if (asciiNumber >= ASCIIAlfabeto.NUMBER_ASCII_MIN_MAIUSCULO && asciiNumber <= ASCIIAlfabeto.NUMBER_ASCII_MAX_MAIUSCULO) {
                asciiNumber = gerarNovaLetraMaiscula(asciiNumber,chave);
            }
            if (asciiNumber >= ASCIIAlfabeto.NUMBER_ASCII_MIN_MINUSCULO && asciiNumber <= ASCIIAlfabeto.NUMBER_ASCII_MAX_MINUSCULO) {
                asciiNumber = gerarNovaLetraMinuscula(asciiNumber,chave);
            }
            novaFrase.append(((char)asciiNumber));
        }

        return novaFrase.toString();
    }

    private int gerarNovaLetraMaiscula(int numberAscii,int chave){
       return gerarNovaLetra(numberAscii, ASCIIAlfabeto.NUMBER_ASCII_MIN_MAIUSCULO, ASCIIAlfabeto.NUMBER_ASCII_MAX_MAIUSCULO,chave);
    }
    
    private int gerarNovaLetraMinuscula(int numberAscii,int chave){
        return gerarNovaLetra(numberAscii, ASCIIAlfabeto.NUMBER_ASCII_MIN_MINUSCULO, ASCIIAlfabeto.NUMBER_ASCII_MAX_MINUSCULO,chave);
    }

    abstract int gerarNovaLetra(int numberAscii, int numberMinimium, int numberMaximium,int chave);

}
