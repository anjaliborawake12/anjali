import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class NewServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    String p=request.getParameter("userpass");  
          
    if(n.equals("admin")||p.equals("admin"))
    {
        out.print("<h2>Welcome</h2>");
    }
    else
    {
        RequestDispatcher rd=request.getRequestDispatcher("newhtml.html");
        rd.forward(request, response);
    }
   }  
}  