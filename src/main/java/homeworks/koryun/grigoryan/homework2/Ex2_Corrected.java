package homeworks.koryun.grigoryan.homework2;

public class Ex2_Corrected {
    public static void main(String[] args) {
        for(int i = 0; i <=5000;i++){
            int temp = i;
            int power = 0;
            while(temp!=0){
                temp/=10;
                power++;
            }
            temp=i;
            int sum=0;
            while(temp!=0){
                int last = temp%10;
                sum+=Math.pow(last, power);
                temp/=10;
            }
            if (sum==i){
                System.out.println(sum);
            }
        }
    }
}
