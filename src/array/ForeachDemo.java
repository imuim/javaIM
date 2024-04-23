package array;

public class ForeachDemo {
    public static void main(String[] args) {
        //while에서 for이 도출된 것처럼
        //배열과 반복문의 목적에만 주목하여 만들어진 문법 foreach
        String[] member={"최진혁","임재우","오미림","방은아"};
        for(String d :member){
            System.out.println(d+"이 상담을 받음");

        }
    }
}
