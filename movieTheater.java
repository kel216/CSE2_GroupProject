import java.util.Scanner;

public class movieTheater{
  public static boolean managerCustomer(){ //selects manager/customer
    Scanner input=new Scanner(System.in);
    
    System.out.println(" Are you a: ");
    System.out.println(" 1. Manager");
    System.out.println(" 2. Customer");
    System.out.print(" Please enter 1 or 2. ");
    int userInput = 0;
    while ((userInput<1)||(userInput >2)) {
      if(input.hasNextInt()) {
        userInput = input.nextInt();
        if((userInput<1)||(userInput >2)) {
          System.out.println(" Invalid input.  Please enter a 1 or 2.");
        }
      }
      else{
        System.out.println("Invalid input.  Please enter a 1 or 2."); 
        input.next();
     }    
   } 
           if (userInput == 1){
             return true;
           }
           else{
             return false;
           }
  }
  public static boolean checkID(){ //checks manager id
    Scanner input=new Scanner(System.in);
  
    String username = "Manager";
    String password = "123456";
      
    System.out.print(" Please enter username (case-sensitive): ");
    String inputUsername = input.next();
    int correctInput = 0;
    System.out.println();
  
    while (correctInput == 0){
    if (inputUsername.equals("Manager")){
      break;
    }
    else{
      System.out.println("Incorrect username.");
      System.out.println();
      return false;
    }
  }
  
  System.out.print("Please enter password (case-sensitive): ");
  String inputPassword = input.next();
  
  while (correctInput ==0){
    if (inputPassword.equals("123456")){
      break;
    }
    else{
      System.out.println("Incorrect password.");
      System.out.println();
      return false;
    }
  }
  
  return true;
    }

public static String getMovieTitle(boolean manager){ //picks title for manager
  Scanner input=new Scanner(System.in);
  int constraints = 0;
  System.out.print("Please enter the movie that will be shown today: ");
  String movieTitle = input.next();
  System.out.println();
 
  while (constraints ==0){
  if (movieTitle.length() <2){
    System.out.println("This movie title is not possible, please enter another title");
    movieTitle = input.next();
  }
  else{
    break;
  }
  }
  
  return movieTitle;
}
    

public static void main(String[] args){
boolean managerCustomer;
boolean iD;
String movieTitle;
String movieTime;
int numberOfSeats;
int continueLoop = 0;
while (continueLoop == 0){
  
managerCustomer = managerCustomer(); //Manager =  true, customer = false


if (managerCustomer == true){
  iD = checkID();  //true = Username and Password correct, false = username and password incorrect
  if (iD==true){
    movieTitle = getMovieTitle(iD); //calls on movie title method 
    
  }
  else{
  continue;}
}

}

}
  public static void printTickets (int ticketNum) { //"prints" tickets
    System.out.println("Now printing "+ticketNum+" tickets. \nPlease enjoy the show!");
  }
  public static int customerTickets (String movieTitle, String movieTime, int seats, int price,Scanner input) {
    System.out.println("Today's movie is "+movieTitle+"\nTime: "+movieTime+"\nPrice: "+price);
    System.out.println("Please enter how many tickets you would like to buy");
    boolean loop = true;
    int ticketNum = 0;
    while (loop) {
      if(input.hasNextInt()){
        ticketNum = input.nextInt;
        if (ticketNum <=seats)
          loop = false;
        else 
          System.out.println("There are only "+seats+" seats available in the theater. Please try again.");
      }
      else
        System.out.println("That is an invailid input. Please try again.");
    }
    return ticketNum;
  }
  public static boolean customerPrice(int ticketNum, double ticketPrice,Scanner input) {
    double totalCost = ticketPrice *ticketNum;
    System.out.println("For "+ticketNum+" tickets, the price will be "+totalCost);
    System.out.println("Please enter the amount to pay:");
    boolean loop = true;
    double pricePaid = 0;
    while(loop) {
      if (input.hasNextDouble()) {
        pricePaid += input.nextDouble();
        if (totalCost>pricePaid) {
          System.out.println("Not enough money has been entered. The price remaining is "+(totalCost-pricePaid)+ ". Please enter more.");
        }
        else if (totalCost<pricePaid){
          System.out.println("Your change is "+(pricePaid-totalCost)+".");
          loop = false;
        }
        else 
          loop = false;
      }
      else 
        System.out.println("Invalid input. Please try again.");
    }
    return true;
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                              
                              