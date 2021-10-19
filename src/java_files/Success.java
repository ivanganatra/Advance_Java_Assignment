package java_files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserProfile")
public class Success extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("type/html");
		PrintWriter out=response.getWriter();
		System.out.println("These are the details");
		String x="",store="";

		x="Your information was successfully accepted";

		out.println("These are the details");
		
//		store="<h4>"+"First Name: "+ partyId +"</h4><br>"+
//		  "<h4>"+"First Name: "+ first_name +"</h4><br>"+
//		  "<h4>"+"LastName: "+ last_name +"</h4><br>"+
//		  "<h4>"+"Address: "+ address +"</h4><br>"+
//		  "<h4>"+"Citye: "+ city +"</h4><br>"+
//		  "<h4>"+"State: "+ state +"</h4><br>"+
//		  "<h4>"+"Country: "+ country +"</h4><br>"+
//		  "<h4>"+"Zip: "+ zip +"</h4><br>"+
//		  "<h4>"+"Phone: "+ phone +"</h4><br>"+
//		  "<h4>"+"UserLoginId: "+ userLoginId+"</h4><br>";
	out.println(
			"<html>"
			+ "<head>"
			+ "<title>"
			+ 	"http Web Title"
			+ "</title>"
			+"</head>"
			+ "<body>"
			+ "<h1>Welcome to Register Servelet!</h1>"
			+"<h3>"+x+"</h3>" 
			+"The user details we received are: \n"
			+"<h3>"+store+"</h3>"
			+"</body>"
			+ "</html>"
	);
//	out.println(store);
	}
}
