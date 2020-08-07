/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DBCOnnection.DBClass;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.net.Proxy.Type.HTTP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/LoginValidator"})
public class LoginValidator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
StringBuffer jb = new StringBuffer();
  String line = null;
  Gson gson=new Gson();
  try {
      
       String jsonBody = new BufferedReader(new InputStreamReader(req.getInputStream())).lines().collect(
            Collectors.joining("\n"));
    if (jsonBody == null || jsonBody.trim().length() == 0) {
        // return error that jsonBody is empty
    }

    // this parses the incoming json to a json object.
    JSONObject jObj = new JSONObject(jsonBody);

    Iterator<String> it = jObj.keys();

    while (it.hasNext()) {
        String key = it.next(); // get key
        Object o = jObj.get(key); // get value
        System.out.println(key + " : " + o); // print the key and value
    }
      
      
//    BufferedReader reader = req.getReader();
//    while ((line = reader.readLine()) != null)
//      jb.append(line);
//     out.println(gson.toJsonTree(jb));
//     reader.close();
//     JSONObject oj=new JSONObject(jb);
//     out.println("result="+oj);
//	    String params = jb.toString();
//	    String[] _params = params.split("&");
//	    for (String param : _params) {
//	      out.println("params(POST)-->" + param);
//	    }

  } catch (Exception e) { out.println(e.getMessage());}


  // Work with the data using methods like...
  // int someInt = jsonObject.getInt("intParamName");
  // String someString = jsonObject.getString("stringParamName");
  // JSONObject nestedObj = jsonObject.getJSONObject("nestedObjName");
  // JSONArray arr = jsonObject.getJSONArray("arrayParamName");
  // etc...
}











//        String dataResult="";
//        try {
//            
//            DBClass db=new DBClass();
//            
//            String obj=req.getParameter("result");
//            out.println(obj);
//            Connection con=db.getConnection();
//            String p="pass123";
//            String query="select * from webDb where Password='"+p+"'";
//            Statement st=con.createStatement();
//            ResultSet res=st.executeQuery(query);
//            if(res.next())
//            {
//                resp.getWriter().write("");
//            }
//            else
//            {  
//                resp.getWriter().write("fail");
//            }
//            
//        } catch (Exception ex) {
//            out.println("hello="+ex.getCause());
//        }
//    }
    
    }

   

