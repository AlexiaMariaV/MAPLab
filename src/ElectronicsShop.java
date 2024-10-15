public class ElectronicsShop {
    public int[] keyboards;
    public int[] usbs;

    public ElectronicsShop(int[] keyboards, int[] usbs) {
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

    public int findMostExpensive(){
        int max = keyboards[0];
        for(int i = 1; i < keyboards.length; i++){
            if(max < keyboards[i]){
                max = keyboards[i];
            }
        }
        for(int i = 1; i < usbs.length; i++){
            if(max < usbs[i]){
                max = usbs[i];
            }
        }
        return max;
    }

    public int findMostExpensiveUSBWithBudget(int budget){
        int maxUSBWithBudget = -1;
        for(int i = 0; i < usbs.length; i++){
            if(usbs[i] <= budget && usbs[i] > maxUSBWithBudget){
                maxUSBWithBudget = usbs[i];
            }
        }
        return maxUSBWithBudget;
    }

    public int findMaxSpent(int budget){
        int maxSpent = -1;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < usbs.length; j++){
                int price = keyboards[i] + usbs[j];
                if(price <= budget && price > maxSpent){
                    maxSpent = price;
                }
            }
        }
        return maxSpent;
    }
}
