import java.util.Scanner;

public class Email {
   private String firstname;
   private String lastname;
   private String password;
   private int defaultPasswordLength = 10;
   private String department;
   private int mailboxCapacity = 500;;
   private String alternateEmail;
   private String email;
   private String companySuffix = "company.com";
   
   //Constructor to receive the first name and last name.
   public Email(String firstname, String lastname) {
	   this.firstname = firstname;
	   this.lastname = lastname;
	   System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);
  
       //method for asking what department.
       this.department = setDepartment();
       System.out.println("Department " + department);

       //method to generate random password.
       this.password = randPasswd(defaultPasswordLength);
       System.out.println("Your password is" + password);

       //Generate email.
       email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + companySuffix;
       System.out.println("Your email is " + email);
   }
   
   //Ask for the department
   private String setDepartment(){
     
     System.out.print("New Employee: " + firstname + ". DEPARTMENT CODES\n1 for Sales\n2 for Develoment\n3 for Accounting\n0 for none\nEnter department");
     Scanner sc = new Scanner(System.in);
     int departChoice = sc.nextInt();
     if(departChoice == 1){
        return "Sales";
     }

     else if(departChoice == 2){
        return "Development";

     }

     else if(departChoice == 3){
        return "Accounting";
     }

     else{
        return "";
     }
   }
   
   //random password
   private String randPasswd(int length){
    String passwdchars = "ABCDEFGHIKLMNOPQRSTUVWXYZ01234567890!@#$%";
    char [] pword = new char[length];
    for(int i = 0; i < length; i++){
       int rand =  (int) (Math.random() * passwdchars.length());
       pword[i] = passwdchars.charAt(rand);
    }
    return new String(pword);
   }
   
   //Set the mailbox capacityy
   public void setMailboxCapacity(int capacity){
       this.mailboxCapacity = capacity;
   }
   
   //set the alternate email
   public void setAlternateEmail(String email){
    this.alternateEmail = email;

   }
  
   //Changet the password;
   public void setPassword(String password){
      this.password = password;
   }

   public int getMailboxCapacity(){
   return mailboxCapacity;
   }

   public String getAlternateEmail(){
      return alternateEmail;
   }

   public String getPassword(){
      return password;
   }

   public String Info(){
      return "DISPLAY NAME: " + firstname + " " + lastname +
               "\nCOMPANY EMAIL: " + email + 
              "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
   }

   public String newEmail(){
      
   }
   
}
