package com.company.Dao;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface UserDao {
	
	boolean addUser(User user);
	
	ArrayList<String[]> getUser();

}
