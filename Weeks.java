import java.util.Scanner;
class Weeks{
  public static void main(String args[]) {
    int day;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day number");
    day=sc.nextInt();
    switch(day){//switch variable//int,byte,short,long,string,enum
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wendsday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Monday");
        break;
      default:
        System.out.println("invalid input");
        
    }
   
  }
}
