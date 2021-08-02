import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Flights;
import com.services.FlightService;

@WebServlet("/flights")
public class FlightServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String leaveFrom = request.getParameter("from");
		String whereTo = request.getParameter("to");

		
		String sDate = request.getParameter("fDate");
		String rDate = request.getParameter("rDate");
		PrintWriter outPrintWriter = response.getWriter();
	

		request.setAttribute("from", leaveFrom);
		request.setAttribute("whereTo", whereTo);
		request.setAttribute("sDate", sDate);
		request.setAttribute("rDate", rDate);

		FlightService f = new FlightService();
		Flights flights = f.getList(sDate, rDate, leaveFrom, whereTo);
		if (flights != null) {

			/*
			 * outPrintWriter.print(flights.getLeaveFrom()+ " " + flights.getWhereTo()+ " "
			 * + flights.getStartDate()+" "+flights.getReturnDate());
			 * outPrintWriter.print(sDate);
			 */
			
			request.getRequestDispatcher("searchFlightResponse.jsp").include(request, response);

		} else {
			outPrintWriter.print("Not found ");
		}

	}

}
