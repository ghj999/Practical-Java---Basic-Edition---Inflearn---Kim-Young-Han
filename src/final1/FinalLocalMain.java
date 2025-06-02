package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        // data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류

        method(10); //메서드 호출
    }
        // static 메서드는 클래스 블록 안에 선언해야 함
        static void method(final int parameter) {
            //parameter = 20; //컴파일 오류  // ❌ 오류: final 파라미터는 값 변경 불가
            System.out.println("parameter = " + parameter);  //사용만 가능
    }
}

