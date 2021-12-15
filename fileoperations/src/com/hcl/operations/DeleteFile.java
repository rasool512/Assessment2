package com.hcl.operations;
import java.io.*;
/*
 * 
 * This file shows how to delete file
 */
public class DeleteFile {
      public void filedelete(String d) {  //this line defines passing string name it is file name also
    	  try {
    	      File f = new File("C:\\\\Users\\\\shaiknayabrasool.s\\\\OneDrive - HCL Technologies Ltd\\\\Desktop\\\\FileIO\\\\"+d+".txt");
    	      //file to be delete  
    	      if (f.delete()) //returns Boolean value  
    	      {
    	        System.out.println("File " + f.getName() + " is deleted");
    	        //getting and printing the file name  
    	      }
    	      else {
    	        System.out.println("Delete operation failed");
    	      }
    	    }
    	    catch(Exception e) {
    	      e.printStackTrace();
    	  }
      }
}
