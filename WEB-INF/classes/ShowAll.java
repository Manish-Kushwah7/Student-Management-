import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 public class ShowAll extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
     out.println("<link rel='stylesheet' href='login.css'>");
  
	out.println(" <title>ShowAll</title>");
out.println("</head>");
out.println("<body bgcolor='cyan'>");
     
    out.println("<div id='menu'>");
        out.println("<ul><li class='text'> <a href='Insert.html'>Insert</a></li><li class='text'> <a href='Insert.html'>Search</a></li><li class='text'> <a href='Update.html'>Update</a></li><li class='text'><a href='ShowAll' >ShowAll</a></li><li class='text'><a href='login11.html'>Logout</a></li>");
            
            out.println("<li>About</li>");
            out.println("<li>Contact us</li>");
        out.println("</ul>");
    out.println("</div>");

out.println("<div class='mydata'>");
 
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql:///mk","root","india");
        Statement st= con.createStatement();
String s = "select * from insmark";
          ResultSet rs = st.executeQuery(s);

out.println("<center>");
    out.println("<table cellpadding='12'>");
out.println("<tr>Rno</td>");
out.println("<td>Name</td>");
out.println("<td>Physcics</td>");
out.println("<td>Chemistry</td>");
out.println("<td>Maths</td>");

out.println("</tr>");
while(rs.next()){
    out.println("<tr>");
        out.println("<td>"+rs.getString(1)+"</td>");
        out.println("<td>"+rs.getString(2)+"</td>");
        out.println("<td>"+rs.getString(3)+"</td>");
        out.println("<td>"+rs.getString(4)+"</td>");
        out.println("<td>"+rs.getString(5)+"</td>");
    out.println("</tr>");
}

    out.println("</table>");
out.println("</center>");
out.println("</div>");
con.close();
    }
    catch(Exception e){
		out.println(e);
	}

out.println("</body>");
out.println("</html>");
	}
 }
		
		

//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;.;%classpath%
