package project;
//inheritance
public class Home extends Login {
 public static void main(String[] args) {
	

	Login l =new Login() ;
    l.setUsername("vaishnavi");
    l.setPassword("123");
    System.out.println(l.getUsername());
    System.out.println(l.getPassword());
 
}
}
