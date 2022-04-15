/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author User
 */
public class another1 {
    
    public void coba(){
        try{
            Object obj = new JSONParser().parse(new FileReader("C://Users//User//OneDrive//Documents//NetBeansProjects//cobaan//src//cobaan/akun_data.json"));
          
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
        // parsing file "JSONExample.json"

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("akun");
          
        // iterating phoneNumbers
        Iterator itr1 = ja.iterator();
          
        while (itr1.hasNext()) 
        {
            Iterator<Map.Entry> itr2 = ((Map) itr1.next()).entrySet().iterator();
            while (itr2.hasNext()) {
                Map.Entry pair = itr2.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
        }catch(Exception ex){
                System.out.println(ex.toString());
            }
    }
}
