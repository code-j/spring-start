package com.gmon.coreruby;

import com.gmon.deal.Deal;

/**
 * Hello world!
 *
 */
public class App 
{
    private String name;

     
    public App() {
    	
    	Deal deal = new Deal();
		this.name = "I Love GMON."+deal.getDealSrl();
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
