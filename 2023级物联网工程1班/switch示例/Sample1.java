import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("������һ���ٷ��Ƶ������ɼ���");
			Scanner reader = new Scanner(System.in);
			int score = reader.nextInt();
			if (score < 0) {
				System.out.println("������ֵ������Χ");
//				break;
				continue;	
			}
			System.out.println("׼����ʼ�ж���...");
			switch (score / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("��");
				break;
			case 8:
				System.out.println("��");
				break;
			case 9:
			case 10:
				System.out.println("��");
				break;
			default:
				break;
			}
		}
	}
}
