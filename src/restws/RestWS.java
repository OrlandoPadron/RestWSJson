/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restws;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author OrlandoPadrón
 */
public class RestWS {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
        String s = "http://services.groupkt.com/country/get/iso2code/IN";
        URL url = new URL(s);
        Scanner scan = new Scanner(url.openStream());
        String source = ""; 
        while (scan.hasNext()){
            source += scan.nextLine();
            
        }
        System.out.println("SOURCE: " +source);
        
        scan.close();
        
        JSONObject obj = new JSONObject (source);
        System.out.println("Json object: " + obj);
        JSONObject res = obj.getJSONObject("RestResponse").getJSONObject("result");
        System.out.println("res: " +res);
        String r1 = res.toString();
        System.out.println("r1:" +r1);
        
        Gson gson = new Gson();
        
        Country country = (Country) gson.fromJson(r1, Country.class);
        System.out.println(country.getName());
        System.out.println(country.getalpha2_code());
        System.out.println(country.getalpha3_code());
        
        
    }
    
}
