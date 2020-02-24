package mainpackage;
import java.io.*;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import operationspackage.operations;


public class mainclass
{private static final Logger LOGGER =LogManager.getLogger(mainclass.class);
	public static void main(String args[])
	{
		int n,c;
		double d;
		Scanner s=new Scanner(System.in);
	    System.out.println("enter the area");
	    n=s.nextInt();
	    System.out.println("choose rate per square feet \n 1.1200inr if stardard material \n 2.1550inr if we use above standard materials \n 3.1800inr if customers needs high standard materials \n 4.2500inr if customer needs high standard materials and fully automated home  ");
	c=s.nextInt();
	switch(c)
	{
	case 1:d=operations.getAppdata().f1200(n); LOGGER.error(d);break;
	case 2:LOGGER.error(operations.getAppdata().f1500(n));break; 
	case 3:LOGGER.error(operations.getAppdata().f1800(n));break; 
    case 4:LOGGER.error(operations.getAppdata().f2500(n));break; 
    default:
    	System.out.println("choose within 1 to 4");

	}
	}


}
