package com;

import java.util.Calendar;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Sample extends TagSupport {
	
	String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
	    try{  
	     out.print("my name is "+name);//printing date and time using JspWriter  
	    }catch(Exception e){System.out.println(e);}  
	    return SKIP_BODY;//will not evaluate the body content of the tag  
		
		
		
	}
	
	
	
}
