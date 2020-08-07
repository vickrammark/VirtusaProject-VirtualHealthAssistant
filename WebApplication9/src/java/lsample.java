/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet("/lsample")
public class lsample extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
       
            String name=req.getParameter("uname");
            int pass=Integer.parseInt(req.getParameter("rollno"));
          //  PrintWriter out=resp.getWriter();
            HttpSession session=req.getSession();
            boolean state=false;
            
            session.setAttribute("uname", name);
            session.setAttribute("pass", pass);
            studentclassdb s=new studentclassdb();
             sqlprocess p=new sqlprocess();
            s.setName(name);
            s.setRollno(pass);
            
       
        try {
            p.sqlprocess(s, resp,req);
        } catch (Exception ex) {
           out.println(ex.getMessage());
        }
            
    }

    
}
