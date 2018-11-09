/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String date) throws IllegalArgumentException {

        String[] dateParts = date.split("/");
        String day = convertArabeToRoman(Integer.parseInt(dateParts[0]));
        String month = convertArabeToRoman(Integer.parseInt(dateParts[1]));
        String year = convertArabeToRoman(Integer.parseInt(dateParts[2]));
        
        return day + "/" + month + "/" + year;
    }

    @Override
    public String convertRomanToArabe(String s) throws IllegalArgumentException {
        int length = s.length();
        int sum = 0;
        int pre = 0;

        for(int i = length - 1; i >= 0; i--){
            int cur = romanTable(s.charAt(i));

            if(i == length - 1){
                sum = sum + cur;
            }else{
               if(cur < pre){
                   sum = sum - cur;
               }else{
                   sum = sum + cur;
               }
            }
            pre = cur;
        }
        
        return Integer.toString(sum);
    }

    public int romanTable(char c){
        int num = 0;
        switch(c){
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
             case 'X':
                num = 10;
                break;
             case 'L':
                 num = 50;
                 break;
             case 'C':
                 num = 100;
                 break;
             case 'D':
                 num = 500;
                 break;
             case 'M':
                 num = 1000;
                 break;
             default:
                 num = 0;
                 break;
        }
        return num;
    }

    @Override
    public String convertArabeToRoman(Integer input) throws IllegalArgumentException {
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        
        return s;
    }

}
