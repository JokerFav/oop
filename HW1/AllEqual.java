public class AllEqual {
    /**
     * Ex 1 in 1.3
     *
     * @param parameters
     * @return answer
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        for(int i = 0; i < 3; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        if(a[0] == a[1] && a[1] == a[2]){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
