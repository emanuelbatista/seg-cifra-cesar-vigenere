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
public class CifraCesar {
    
    
    //
    private final CriptografiaCesar criptografiaCesar;
    private final DescriptografiaCesar descriptografiaCesar;

    public CifraCesar() {
        this.criptografiaCesar=new CriptografiaCesar();
        this.descriptografiaCesar=new DescriptografiaCesar();
    }
    
    
    
    public String criptografar(String frase,int chave){
       return criptografiaCesar.criptografar(frase,chave);
    }
    
    public String descriptografar(String frase,int chave){
        return descriptografiaCesar.descriptograr(frase,chave);
    }
    
    
    
    
    
}
