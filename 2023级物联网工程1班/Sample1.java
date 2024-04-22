import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("请输入一个百分制的整数成绩：");
			Scanner reader = new Scanner(System.in);
			int score = reader.nextInt();
			if (score < 0) {
				System.out.println("输入数值超出范围");
//				break;
				continue;	
			}
			System.out.println("准备开始判断了...");
			switch (score / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");
				break;
			case 6:
				System.out.println("及格");
				break;
			case 7:
				System.out.println("中");
				break;
			case 8:
				System.out.println("良");
				break;
			case 9:
			case 10:
				System.out.println("优");
				break;
			default:
				break;
			}
		}
	}
}
