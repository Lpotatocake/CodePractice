public class PerfectsQuare {
    static int i=1;
    static int i2=0;
    public static void main(String[] args) {
        for (int j = 0; j<100000; j++) {
            for (int k = 0; k<1000; k++) {
                if((i+j)+100==k*k){
                    i2 = (i+j)+100;
                    for (int l = 0; l<1000; l++) {
                        if ((i2+168)==l*l){
                            System.out.println("这个数是："+(i+j));
                            //break;
                        }
                    }
                }
            }
        }
    }
}
