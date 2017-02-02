package andrii;

import javax.servlet.http.*;
import java.io.*;
import java.time.LocalDate;

public class Ch1Servlet extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        LocalDate today = LocalDate.now();
        out.println("<html> " +
            "<body>" +
            "<h1 align-center>HF\'s Chapter1 Servlet</h1>" +
            "<br>" + today + "</body>" + "</html>");

    }
}
