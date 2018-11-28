import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int num; // 출력할 구구단 수	
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();		
		System.out.println("구구단 중 출력할 단을 입력하시오 : "+num);
		
		/*for(int i=1;i<10;i++)
		{
			System.out.println(num*i);
		}*/		
		/*int i=1;
		while(i<10)
		{
			System.out.println(num*i);
			i=i+1;
		}*/
		if(num>1 && num<10)
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(num*i);
			}
		}
		else
			System.out.println("잘못입력했다.");
		}		
}
