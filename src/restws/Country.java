/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restws;

/**
 *
 * @author OrlandoPadrón
 */
class Country {
    
    private String alpha3_code;
    private String alpha2_code;
    private String name; 

    public String getalpha3_code() {
        return "COD3: " + alpha3_code;
    }

    public String getalpha2_code() {
        return "COD2: " + alpha2_code;
    }

    public String getName() {
        return "NAME: " + name;
    }

    public void setAlpha3_code(String Alpha3_code) {
        this.alpha3_code = Alpha3_code;
    }

    public void setAlpha2_code(String Alpha2_code) {
        this.alpha2_code = Alpha2_code;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
