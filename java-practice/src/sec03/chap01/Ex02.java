package sec03.chap01;

public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
//        int smallIntNum = 123;
        int smallIntNum = 12345;

        //  명시적(강제) 형변환
        //  - 개발자 : "내가 책임질테니까 그냥 넣으세요."
        byteNum = (byte) smallIntNum; // 명시적 형변환

        byte byteNum2 = 12345 % 128;
    }
}
