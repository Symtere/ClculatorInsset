/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author user
 */
public interface CedricConverterIntegerToRomanServiceAsync {

    /**
     * Convertion nombre entier en chiffre romain
     *
     * @param nbr
     * @return
     * @throws IllegalArgumentException
     */
    void AmountMultiPourcentage(String nbr, String pourcent, AsyncCallback<String[]> callback);
    void ReducDivisePourcentage(String nbr, String pourcent, AsyncCallback<String[]> callback);
}
