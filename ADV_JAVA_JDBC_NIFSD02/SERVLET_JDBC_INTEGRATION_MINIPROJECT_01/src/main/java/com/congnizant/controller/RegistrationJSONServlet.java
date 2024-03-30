package com.congnizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.congnizant.bean.UserInfo;
import com.congnizant.service.RegistrationSevice;
import com.congnizant.service.RegistrationSeviceImpl;
import com.congnizant.vo.UserInfoVO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg-json")
public class RegistrationJSONServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Data Type=>"+req.getContentType());	
		Gson gson = new Gson();
		StringBuilder sb = new StringBuilder();
        String s;
        while ((s = req.getReader().readLine()) != null) {
        	System.out.println(s);
            sb.append(s);
        }
        System.out.println(sb);
        //Convert JSON String to Java Object
        UserInfo student = (UserInfo) gson.fromJson(sb.toString(), UserInfo.class);
        System.out.println(student);
        
		// call the service layer
		RegistrationSevice rd=RegistrationSeviceImpl.getInstace();
		UserInfoVO userInfo = rd.registerUserInfo(new UserInfoVO(student.getFirstName(),student.getLastName(), student.getUser(), student.getPassword()));
		
		
		resp.setContentType("application/json");  
		PrintWriter pw=resp.getWriter();	
		JsonObject json = new JsonObject();
	    // put some value pairs into the JSON object .
	    json.addProperty("Status", userInfo.getFirstName()+" Registerd Successfully");
	    // finally output the json string       
	    pw.print(json.toString());
	}

}
