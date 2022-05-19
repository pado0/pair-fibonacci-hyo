import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        // 입력 함수 getUserInput
        int n = getUserInput();

        // 피보나치 수행 함수 fibonacci()
        int[] arr = new int[n];

        getFibonacci(arr);

        // 출력함수 printOut()
        printNumbers(arr);
    }

    static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        return scanner.nextInt();
    }

    static void getFibonacci(int[] fibonacci){
        for(int i=0 ; i< fibonacci.length ; i++){
            if(i == 0 || i == 1) fibonacci[i] = 1;
            else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    static void printNumbers(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}