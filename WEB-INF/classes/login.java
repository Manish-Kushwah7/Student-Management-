import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 public class login extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///mk","root","india");
			Statement st= con.createStatement();
			String q="insert into login2 values('"+s1+"','"+s2+"','"+s3+"')";
			st.executeUpdate(q);
response.sendRedirect("login11.html");
			response.sendRedirect("login11.html");
			con.close();
		}
	catch(Exception e){
		out.println(e);
	}
	out.println("</html>");
		out.println("</body>");
		
	}
}


//C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;.;%classpath%
