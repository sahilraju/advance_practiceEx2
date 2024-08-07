package com.mphasis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mpahsis.dto.User;

public class RegisterDao {

	private Connection connection;
	private PreparedStatement prepare;

	public boolean insertRegistrationDetails(User user) {

		connection = DBUtil.establishConnection();

		try {

			prepare = connection.prepareStatement(
					"INSERT INTO userregister (id, firstname, lastname, country, languages, gender) VALUES(?,?,?,?,?,?)"); 

			prepare.setString(1, user.getUserID()); 
			prepare.setString(2, user.getFirstName());
			prepare.setString(3, user.getLastName());
			prepare.setString(4, user.getCountry());
			prepare.setString(5, user.getLannguagesKnown());
			prepare.setString(6, user.getGender());

			int rowsAffected = prepare.executeUpdate();
			if (rowsAffected == 1)
				return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (prepare != null)
					prepare.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}

}
