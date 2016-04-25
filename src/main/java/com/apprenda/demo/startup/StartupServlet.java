package com.apprenda.demo.startup;

import java.io.File;

import javax.servlet.http.HttpServlet;

public class StartupServlet extends HttpServlet {
	
	//Kill the server on first startup
	public void init()
	
	{
		
		if(true)
			return;
		
		try {
			
			
			File alreadyStarted = new File("alreadyStarted");
			
			if(alreadyStarted.exists())
			{
				alreadyStarted.delete();
				
				return;
			}
			
			alreadyStarted.createNewFile();
			
			System.exit(0);
			
			
			
		}
		
		catch(Exception e)
		
		{
			
		}
		
		
	}
	
	

}
