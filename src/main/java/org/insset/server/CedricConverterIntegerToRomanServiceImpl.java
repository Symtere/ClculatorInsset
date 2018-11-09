/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.CedricConverterIntegerToRomanService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class CedricConverterIntegerToRomanServiceImpl extends RemoteServiceServlet implements
        CedricConverterIntegerToRomanService {

    @Override
    public String[] AmountMultiPourcentage(String nbr, String pourcent) throws IllegalArgumentException {
        double amount = Double.parseDouble(nbr);
        double pourcentage = Double.parseDouble(pourcent)/100;
        
        double reduction = amount * pourcentage;
        
        double prix = amount - reduction;
        
        String result[] = {Double.toString(reduction), Double.toString(prix)};

        return result;
    }
    
    @Override
    public String[] ReducDivisePourcentage(String nbr, String pourcent) throws IllegalArgumentException {
        double amount = Double.parseDouble(nbr);
        double coeffMultiplicateur = 1-(Double.parseDouble(pourcent)/100);
        
        double prix = amount/coeffMultiplicateur;
        
        String result[] = {pourcent, Double.toString(prix)};

        return result;
    }

}
