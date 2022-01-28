package oop_project;

import java.util.Scanner;

public class input {
	Launchpage l;
	Myframe f;
	int n;
	int ft[];
	int wt[];
	int et[];
	int it[];
	int ct[];
	int cot[];
	public input() {
	l=new Launchpage(this);
	}
	void createframe2()
	{
		n=l.assembly_lines;
		ft=new int[n];
		wt=new int[n];
		et=new int[n];
		it=new int[n];
		ct=new int[n];
		cot=new int[n];
		f=new Myframe(this);
	}
	void callLine()
	{
		

	    	ft[f.count] = (Integer) f.jComboBox1.getSelectedItem();
	    	
	    	 wt[f.count] = (Integer) f.jComboBox2.getSelectedItem();
//	    	 
	    	 et[f.count] = (Integer) f.jComboBox3.getSelectedItem();
//	    	
	    	 it[f.count] = (Integer) f.jComboBox4.getSelectedItem();

	    	 ct[f.count] = (Integer) f.jComboBox5.getSelectedItem();
   	

	    	 cot[f.count] = (Integer) f.jComboBox6.getSelectedItem();
    	 
	}
	

	void startLine() {
		 System.out.println("00:00 Starting Production");
		 int i;
	 for (i = 0; i < n; i++) {
	        
	        AssemblyLine makeCar
	            = new AssemblyLine(ft[i],wt[i],et[i],it[i],ct[i],cot[i],i+1);
	        makeCar.start();
	        
	        
	    }

		
		
	
	}
	}
