public class KadanesAlgoritm {
    
    public static void kdAlgorithm(int myarr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<myarr.length;i++){
            cs += myarr[i];
            if(cs<0){
                cs = 0;
            } 
            if(ms<cs){
                ms=cs;
            }
        } System.out.println(ms);
    }

    public static void main(String[]args){
        int myarr[] = {-2,-3,4,-1,-2,1,5,-3};
        kdAlgorithm(myarr);
    }
}