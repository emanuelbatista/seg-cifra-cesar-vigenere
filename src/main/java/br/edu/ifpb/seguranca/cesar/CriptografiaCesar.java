/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.cesar;

/**
 *
 * @author emanuel
 */
public class CriptografiaCesar extends TemplateCriptografiaCesar {

    public String criptografar(String frase,int chave) {
        return template(frase,chave);
    }

    @Override
    int gerarNovaLetra(int numberAscii, int numberMinimium, int numberMaximium,int chave) {
        chave=chave%26;
        int newNumber = numberAscii + chave;
        if (newNumber > numberMaximium) {
            newNumber = (newNumber-numberMaximium) + (numberMinimium - 1);
        }
        return newNumber;

    }

}
