/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca.exception;

/**
 *
 * @author emanuel
 */
public class ChaveVaziaException extends Exception {

    /**
     * Creates a new instance of <code>ChaveVaziaException</code> without detail
     * message.
     */
    public ChaveVaziaException() {
    }

    /**
     * Constructs an instance of <code>ChaveVaziaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ChaveVaziaException(String msg) {
        super(msg);
    }
}
