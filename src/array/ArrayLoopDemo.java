package array;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] classGruop= new String[4];
        classGruop[0]="임재우";
        classGruop[1]="오미림";
        classGruop[2]="이태양";
        classGruop[3]="문소희";
//        System.out.println(classGruop.length);
        for(int i=0;i<classGruop.length;i++){
            String member=classGruop[i];//이 분이 어려움--- 처음에 0부터 들어간다.
            System.out.println(member+"이 상담을 받았습니다.");

            //배열 --> 반복문 (순서대로 하나씩 처리할 수 ㅇ)
        }

    }
}
