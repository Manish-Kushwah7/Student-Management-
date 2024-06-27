import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class serach extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title> Search</title>");
	
	out.println("<link rel='stylesheet' href='seach.css'>");
	out.println("</head>");
	
	out.println("</head>");
	out.println("<body>");
	out.println("<center>");
	try{
		String s1=request.getParameter("u1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///mk","root","india");
		Statement st= con.createStatement();
		String q="select * from insmark where rno='"+s1+"' ";
		ResultSet rs=st.executeQuery(q);
	out.println("<table>");
	out.println("<tr>");
	while(rs.next()){
	out.println("<td>"+rs.getString(1)+"</td>");
	out.println("<td>"+rs.getString(2)+"</td>");	
out.println("<td>"+rs.getString(3)+"</td>");
out.println("<td>"+rs.getString(4)+"</td>");
out.println("</tr>");
	}
out.println("");
	}
catch(Exception e){
	out.println(e);
}
out.println("</table>");
out.println("</center>");
out.println("</body>");
out.println("</html>");

}

}