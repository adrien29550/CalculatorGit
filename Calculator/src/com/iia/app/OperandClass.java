package com.iia.app;



public class OperandClass {

    /**
     * Permet d'additionner deux valeurs.
     * @param val1 valeur 1
     * @param val2 valeur 2
     * @return retour en int
     */
    public static int add(int val1, int val2) {
        
        /*
        try {
            
         }
         catch (Exception e){
             
         }*/
        
        return val1 + val2;
        
    }

    /**
     * Permet de soustraire deux valeurs.
     * @param val1 valeur 1
     * @param val2 valeur 2
     * @return retour en int
     */
    public static int sub(int val1, int val2) {
        return val1 - val2;
    }

    /**
     * Permet de multiplier deux valeurs.
     * @param val1 valeur 1
     * @param val2 valeur 2
     * @return retour en int
     */
    public static int mul(int val1, int val2) {
        return val1 * val2;
    }

    /**
     * Permet de diviser deux valeurs.
     * @param val1 valeur 1
     * @param val2 valeur 2
     * @return retour en int
     */
    public static int div(int val1, int val2) {
        return val1 / val2;
    }
}
