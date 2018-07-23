public class Main {

    // BinarySearch O(log n) - this search is definitly faster than simple_search
    public static String binary_search(Integer [] tab, int element){

        // Use variables low and high to control which part of list is search
        int low = 0;
        int high = tab.length;

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

    // SimpleSearch O(n)
    public static String simple_search(Integer [] tab, int element){
        
        for(int i=0; i<tab.length;i++){
            if(tab[i] == element){
                return "Jest na pozycji: "+ i;
            }
        }

        return" Wrong element!" ;
    }

    public static void main (String args[]){

        Integer [] tab = new Integer[]{4,6,7,11,12,13,14,15,16,32};
        Integer [] tab2 = new Integer[]{3,2,1,14,25,63,1};
        // tab is sort
        System.out.println("I'm looking for number 32: "+binary_search(tab,32));
        System.out.println("I'm looking for number 32: "+simple_search(tab,32));

        //tab2 is not sort and we have a problem with binary_search
        System.out.println("I'm looking for number 1: "+simple_search(tab2,1));
        System.out.println("I'm looking for number 1: "+binary_search(tab2,1));
    }
}