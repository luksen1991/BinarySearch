public class main {

    public static String binary_search(Integer [] tab, int element){

        // Use variables low and high to control which part of list is search
        int low = 0;
        int high = tab.length-1;

        while(low<=high){

            int mid = (low+high)/2;
            int guess= tab[mid];

            if(guess==element){
                return "Jest na pozycji: "+mid;
            }else if(guess>element){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }

        return" Wrong element!" ;
    }

    public static void main(String args){

        Integer [] tab = new Integer[]{4,6,7,11};
        System.out.println("I'm looking for number 7: "+binary_search(tab,7));
    }
}