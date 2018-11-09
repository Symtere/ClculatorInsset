/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author user
 */
@RemoteServiceRelativePath("cedricConvertIntegerToRoman")
public interface CedricConverterIntegerToRomanService extends RemoteService {

    /**
     * Convertion nombre entier en chiffre romain
     *
     * @param nbr
     * @return
     * @throws IllegalArgumentException
     */
    String[] AmountMultiPourcentage(String nbr, String pourcent) throws IllegalArgumentException;
    
    String[] ReducDivisePourcentage(String nbr, String pourcent) throws IllegalArgumentException;

}
