import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String n1, n2;
		boolean isDone = false;
		int real1 = 0, real2 = 0;
		
		while (isDone != true) {
			try {			
				System.out.print("1번 피연산자를 입력하세요: ");		
				n1 = sc.next();		
				
				int num1 = Integer.parseInt(n1);
										
				isDone = true;
				
				real1 = num1;
			} catch(NumberFormatException e) {			
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			} 
			
			isDone = false;
			
			while (isDone != true) {
				try {				
					System.out.print("2번 피연산자를 입력하세요: ");
					n2 = sc.next();
					
					int num2 = Integer.parseInt(n2);
					
					isDone = true;
					
					real2 = num2;
				} catch(NumberFormatException e) {			
					System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
					continue;
				} 
			}
			 
			System.out.println(real1 + " + " + real2 + " = " + (real1+real2));
			
			sc.close();
			
		}
		
	}

}
