import java.util.Scanner;

// 배열 5, 10, 15, 20, 25, 30에서 사용자가 입력한 값의 인덱스를 찾아 출력
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {5,10,15,20,25};
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num < 5){
            System.out.println("선택하신 값의 인덱스는 " + numbers[num]);
        }
        else
        {
            System.out.println("선택하신 값의 인덱스는 없습니다.");
        }
    }
}
