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
public class DescriptografiaCesar extends TemplateCriptografiaCesar{
    
    public String descriptograr(String frase,int chave){
        return template(frase,chave);
    }

    @Override
    int gerarNovaLetra(int numberAscii, int numberMinimium, int numberMaximium,int chave) {
        chave=chave%26;
        int newNumber = numberAscii - chave;
        if (newNumber < numberMinimium) {
            newNumber = (numberMaximium+1)-(numberMinimium-newNumber);
        }
        return newNumber;
    }
    
}
