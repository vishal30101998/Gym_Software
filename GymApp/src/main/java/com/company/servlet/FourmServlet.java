package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.Dao.User;
import com.company.Dao.UserDao;
import com.company.Dao.UserDaoImp;
import com.company.util.DBUtil;

/**
 * Servlet implementation class FourmServlet
 */
public class FourmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		User user = new User();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setAge(age);
		user.setAddress(address);
		
		if (userDao.addUser(user)) {
//			String query = "SELECT * from gym_db";
//			try (Connection connection = DBUtil.getConnection();
//		             PreparedStatement preparedStatement = connection.prepareStatement(query);
//					ResultSet resultSet = preparedStatement.executeQuery()){
//				
//				ArrayList<String[]> data = new ArrayList<>();
//
//	            // Iterate over the result set and add each row to the list
//	            while (resultSet.next()) {
//	                String[] row = new String[5]; // Assuming your table has 3 columns
//	                row[0] = resultSet.getString(1); // Replace 1, 2, 3 with actual column indices
//	                row[1] = resultSet.getString(2);
//	                row[2] = resultSet.getString(3);
//	                row[3] = resultSet.getString(4);
//	                row[4] = resultSet.getString(5);
//	                data.add(row);
//				
//			}
//	            request.setAttribute("data", data);
//	            request.getRequestDispatcher("Register.jsp").forward(request, response);
			
			
//	            }
//			catch(SQLException e){
//				e.printStackTrace();
//	            
//				
//			}
			
			
			// Create a list to hold the data
            
            

            // Pass the data to the JSP page
			String ruppee = "6500";
			String membership = "Four Month MemberShip";
			response.sendRedirect("RegisteredForm.jsp?ruppee="+ruppee+"&membership="+membership);
		
		}
		      
			
        
	   else {
            response.sendRedirect("Register.jsp?error=1");
        }
	}

}
