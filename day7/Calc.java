package day7;
import java.util.Scanner;

public class Calc {
	
public void Calc(){
	 
	 System.out.println("계산기 실행합니다. 숫자를 입력하세요.");
	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int result = 0;
		
		switch(op){
	 	case "+" : result=a+b;
	 	break;
	 	case "-" : result=a-b;
	 	break;
	 	case "*" : result=a*b;
	 	break;
	 	case "/" : result=a/b; 
	 	break;
	 	case "%" : result=a%b;
	 	break;
		}
		System.out.println(a+op+b+"="+result);
 }
}
