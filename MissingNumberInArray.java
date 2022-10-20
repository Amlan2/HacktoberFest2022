public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] inputArr = {1,2,3,4,5,6,7,8,8,9,10,25,50,95,100};
        boolean[] missing = new boolean[100];
        for(int i=0;i<inputArr.length;i++) {
            if(inputArr[i]<=100 && inputArr[i]>0) {
                missing[inputArr[i]-1]=true;
            }
        }
        System.out.println("Missing values are :");
        for(int i=0;i<100;i++) {
            if(missing[i]==false) {
                System.out.println(i+1);
            }
        }
    }
}
