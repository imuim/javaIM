package array;

public class LengthDemo {
    public static void main(String[] args) {
//        String[] classGroup={"임재우","신재철","김재형","박정례"};//원소 또는 엘리먼트 --- 한번에 정의
        //배열을 정의하는 방법, 배열에 담겨있는 수를 확인 방법
        String[] classGroup = new String[4];// new 문자열을 데이터 타입을 정의 방법 --- 분할하여 정의
        classGroup[0] ="최진혁";
        System.out.println(classGroup.length);
        classGroup[1] ="임재우";
        System.out.println(classGroup.length);//.length 몇개의 값이 담겨지는지?를 말함
        //----인덱스[0]----최진혁:엘리멘트(아타이=값)----인덱스의 최대크기 [4]
    }
}
