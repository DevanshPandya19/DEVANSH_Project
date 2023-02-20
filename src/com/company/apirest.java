package com.company;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class apirest {

    public static void main(String[] args) {



        try{
            URL url = new URL("https://jr-linguist-85a69-default-rtdb.firebaseio.com/.json");

            URLConnection urlc = url.openConnection();
            urlc.setRequestProperty("Content-Type", "application/json");

            urlc.setDoOutput(true);
            urlc.setAllowUserInteraction(false);



            //get result
            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String l = null;
            String data="";
            while ((l=br.readLine())!=null) {
                data+=l;
            }


            System.out.println("Data : "+data);

            Map<String,String> map=new HashMap<String, String>();

            for (String s : Data) {
                String[] t = s.split(":");
                map.put(t[0], t[1]);
            }

            for (String s : map.keySet()) {
                System.out.println(s + " is " + map.get(s));
            }


            map.put("name", "meet");




            System.out.println("Name  : "+map.get("name"));


            br.close();
        } catch (Exception e){
            System.out.println("Errors");

        }
    }

}
