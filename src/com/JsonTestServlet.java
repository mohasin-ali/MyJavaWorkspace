//$Id$
package com;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;


public class JsonTestServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	StringBuffer jb = new StringBuffer();
	  String line = null;

	  BufferedReader reader = req.getReader();
	  while ((line = reader.readLine()) != null)
	      jb.append(line);

	  String jsonstring = jb.toString(); 
	  System.out.println(" and String is :"+jsonstring);
	  try {
		JSONObject jsonObj=new JSONObject(jsonstring);
		
		System.out.println(jsonObj +" and String is :"+jsonstring);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  System.out.println(jb);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
