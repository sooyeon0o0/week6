// 배열 20, 30, 50, 70, 90의 요소들의 평균을 구하고 출력
public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {20,30,50,70,90};

        int length = numbers.length;
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        int average = sum / length;
        System.out.println("요소들의 평균은: " + average);
    }
}
