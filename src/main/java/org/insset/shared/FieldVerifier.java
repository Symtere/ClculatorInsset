package org.insset.shared;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> packing because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is note translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

    /**
     * Verifies that the specified name is valid for our service.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidName(String name) {
        if ((name == null) || (name.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * Verifies that the specified value is valide.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidDecimal(Integer nbr) {
        try {
            if(nbr < 1 || nbr > 2000)
                return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public static boolean isValidDouble(String nbr, String nbr2) {
        try {
            double nbrd = Double.parseDouble(nbr);
            double nbr2d = Double.parseDouble(nbr2);
            if(nbrd < 1 || nbrd > 50000)
                return false;
            else if(nbr2d < 1 || nbr2d > 50000)
                return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isValidRoman(String nbr) {
        if(nbr=="") return false;
        Integer max = nbr.length();
        for(Integer i = 0; i < max; i++) {
            char n = nbr.charAt(i);
            String s=Character.toString(n);
            
            if (!s.matches("I|V|X|L|C|D|M"))
                return false;
        }
        return true;
    }

    public static boolean isValidDate(String date) {
        try {
            String[] dateParts = date.split("/");
            
            if(dateParts.length != 3)
                return false;
            
            Integer day = Integer.parseInt(dateParts[0]);
            Integer month = Integer.parseInt(dateParts[1]);
            Integer year = Integer.parseInt(dateParts[2]);
            
            if(day < 1 || day > 31)
                return false;
            if(month < 1 || month > 12)
                return false;
            if(year < 1 || year > 2000)
                return false;
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
