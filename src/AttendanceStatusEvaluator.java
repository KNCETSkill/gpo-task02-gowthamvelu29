import java.util.Scanner;
public class AttendanceStatusEvaluator{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int attendance=scanner.nextInt();
    if(attendance>85){
      System.out.println("Excellent");
    }
    else if(attendance>=60){
      System.out.println("Satisfactory");
      }
    else
          {
      System.out.println("Poor");
    }
  }
}
