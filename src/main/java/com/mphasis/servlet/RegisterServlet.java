package com.mphasis.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mpahsis.dto.User;
import com.mphasis.exception.BusinessException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private RegisterBO regBO;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("submit") != null) {

			String firstName = req.getParameter("fname");
			String lastName = req.getParameter("lname");
			String country = req.getParameter("country");
			String langKnown = "";
			if (req.getParameter("hindi") != null)
				langKnown += req.getParameter("hindi") + ", ";
			if (req.getParameter("eng") != null)
				langKnown += req.getParameter("eng") + ", ";
			if (req.getParameter("br") != null)
				langKnown += req.getParameter("br") + " ";

			String gender = req.getParameter("gender");

			RequestDispatcher dispatcher = null;

			try {

				if (firstName == null || lastName == null || country == null || langKnown.length() == 0
						|| gender == null)
					throw new BusinessException("Some fields are not filled");

				Random random = new Random();
				String regID = "reg" + random.toString().substring(17);

				User user = new User();
				user.setUserID(regID);
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setCountry(country);
				user.setLannguagesKnown(langKnown);
				user.setGender(gender);

				System.out.println(user.toString());

				regBO = new RegisterBO();
				boolean isInserted = regBO.userRegisterBO(user);

				if (isInserted) {
					req.setAttribute("registerID", regID);
					dispatcher = req.getRequestDispatcher("successPage.jsp");
					dispatcher.forward(req, resp);
				}
			} catch (BusinessException e) {
 
				req.setAttribute("errorMessage", "All fileds are required");
				dispatcher = req.getRequestDispatcher("registration.jsp");
				dispatcher.forward(req, resp);

			}

		}

	}

}
