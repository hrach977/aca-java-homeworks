package homeworks.koryun.grigoryan.homework2;

public class Ex2 {
    public static void main(String[] args) {
        for(int i = 1;i<=500;i++){
            int temp = i;
            int sumOfCubes=0;
            while(temp!=0){
                int last = temp % 10;
                sumOfCubes +=last*last*last;
                temp/=10;
            }
            if(sumOfCubes==i) {
                System.out.println(i);
            }
        }

    }

}
