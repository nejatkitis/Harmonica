public class Harmonica {
    public static void main(String[] args) {
        double [] list = {1,2,3,4,5,6};
        double sum =0.0,ave=0.0;
        for (int i=0;i<list.length;i++){
            sum += 1/list[i];
        }
        ave = list.length/sum;
        System.out.println(ave);
    }
}
