import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 public class insert1 extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		String s4=request.getParameter("u4");
		String s5=request.getParameter("u5");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///mk","root","india");
			Statement st= con.createStatement();
	String s = "insert into insmark value('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')";
            	st.executeUpdate(s);

response.sendRedirect("menu.html");
			
		}
	catch(Exception e){
		out.println(e);
	}
	out.println("</html>");
		out.println("</body>");
		
	}
}


//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;.;%classpath%
