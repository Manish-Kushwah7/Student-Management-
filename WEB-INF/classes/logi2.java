import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 public class logi2 extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///mk","root","india");
			Statement st= con.createStatement();
			String q="select * from login2 where name='"+s1+"' AND pass='"+s2+"'";
	ResultSet rs=st.executeQuery(q);
	if(rs.next()){
		Cookie ck =new Cookie("uname","ram");
		ck.setMaxAge(10);
		response.addCokie(ck);
		else{
response.sendRedirect("login11.html");
				
		}
		}
	catch(Exception e){
		out.println(e);
	}
	out.println("</html>");
		out.println("</body>");
		
	}
}


//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;.;%classpath%
