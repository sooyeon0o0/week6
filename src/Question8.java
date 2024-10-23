import java.util.Scanner;

//배열 2, 4, 6, 8, 10에서 사용자가 입력한 값이 배열에 있는지 확인하고, 있으면 "존재합니다",
//없으면 "존재하지 않습니다"를 출력
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();
        int[] numbers = {2,4,6,8,10};

        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                System.out.println("존재합니다.");
                break;
            } else {
                System.out.println("존재하지 않습니다.");
                break;
            }
        }
    }
}
