public class ElektronicsShop {
    public int[] keyboards;
    public int[] usbs;

    public ElektronicsShop(int[] keyboards, int[] usbs) {
    this.keyboards = keyboards;
    this.usbs = usbs;
    }

    public int findCheapestKeyboard(){
        int min = keyboards[0];
        for(int i = 1; i < keyboards.length; i++){
            if(min > keyboards[i]){
                min = keyboards[i];
            }
        }
        return min;
    }


}
