package project;

import java.util.Scanner;
//encapsulation
public class Login extends Auth {	
private String username ;
public void setUsername(String username) {
	this.username = username;
}
public String getUsername() {
	return username;
}
private String password ;
public void setPassword(String password) {
	this.password = password;
}
public String getPassword() {
	return password;
}
  //polymorphysum
   public boolean login(String name ) {
	   if (username.equals(name)) {
		   System.out.println("login successfuly");
		   return true;
	   }else {
		   System.out.println("invalid user");
	   }
	   return false;
   
   }	   
   public boolean login(String name , String pass) {
	   if (password.equals(pass)) {
		   System.out.println("login successfuly");
		   return true;
	   }else {
		   System.out.println("invalid user");
	   }
	   return false;
   
   }	   
public static void main(String[] args) {
	Login L = new Login();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user name");
	String name =sc.nextLine();
	System.out.println("enter user password");
	String pass =sc.nextLine();
	
}   
}