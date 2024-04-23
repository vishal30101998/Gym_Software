package com.company.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean addUser(User user) {
		String query = "INSERT INTO gym_db (username, email, age, address) VALUES (?, ?, ?,?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getAge());
            preparedStatement.setString(4, user.getAddress());
            

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public ArrayList<String []> getUser() {
		String query = "SELECT * from gym_db";
		try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery()){
			
			ArrayList<String[]> data = new ArrayList<>();

            // Iterate over the result set and add each row to the list
            while (resultSet.next()) {
                String[] row = new String[5]; // Assuming your table has 3 columns
                row[0] = resultSet.getString(1); // Replace 1, 2, 3 with actual column indices
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                data.add(row);
                
			
		}
            return data;
//            request.setAttribute("data", data);
//            
//            request.getRequestDispatcher("Register.jsp").forward(request, response);
            }
		catch(SQLException e){
			e.printStackTrace();
            
			
                return null;
			
		}
		
	}

	
	

}
