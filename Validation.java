package com.dipika.library.validation;

public class Validation 
{
	   public static boolean isValidStudentId(String studentId) 
	   {
		return studentId.matches("[0-9]+");
	   }

   public static boolean isValidAdminName(String adminName) {
	   return adminName.matches("^[a-zA-Z]*$");
   }
   public static boolean  isValidAdminPassword(String adminPassword)
   {    
	     return adminPassword.matches("^[a-zA-Z]*$"); 	
	     
   }
   public static boolean isValidStudentName(String studentName) {
	   return studentName.matches("^[a-zA-Z]*$");
   }
   public static boolean  isValidStudentPassword(String studentPassword)
   {    
	   return studentPassword.matches( "^(?=.*[0-9])"
	            + "(?=.*[a-z])(?=.*[A-Z])"
	            + "(?=.*[@#$%^&+=])"
	            + ".{8,16}$"); 		
	     
   }
   public static boolean  isValidStudentEmailId(String studentEmailId) {
	     return studentEmailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
   }
   public static boolean  isValidStudentContactNo(String studentContactNo) {
	     return studentContactNo.length()==10 && studentContactNo.matches("\\d+");
 }
   public static boolean isValidName(String name) {
	   return name.matches("^[a-zA-Z]*$");
   }
   
   
	public static boolean isValidBookName(String bookName) {
		   return bookName.matches("^[a-zA-Z  ]*$");
	}
	public static boolean isValidAutherName(String autherName) {
		   return autherName.matches("^[a-zA-Z  ]*$");
	}
	public static boolean isValidBookType(String bookType) {
		   return bookType.matches("^[a-zA-Z  ]*$");
	}
	public static boolean isValidStudentAddress(String studentAddress) {
		   return studentAddress.matches("^[a-zA-Z]*$");
	}

}
