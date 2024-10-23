// 배열 5, 10, 15, 20, 25를 역순으로 출력
public class Question7 {
    public static void main(String[] args) {

        int[] numbers = {5,10,15,20,25};

        for (int i = 4; i < numbers.length; i--) {
            System.out.println(numbers[i]);
        }
    }
}
