package sec03.chap01;

public class Ex03 {
    public static void main(String[] args) {
        // 이항 연산자 -> 결과값을 반환함
        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}