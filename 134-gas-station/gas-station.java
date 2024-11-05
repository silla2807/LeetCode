class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int current_gas = 0;
        int total_gas = 0;
        int startStation = 0;
        for (int i = 0; i < n; i++) {

         total_gas += (gas[i]-cost[i]);
         current_gas += gas[i] - cost[i];

           if(current_gas < 0){
            startStation = i + 1;
            current_gas =0;
           }
        }

        return total_gas >= 0 ?   startStation : -1;
    }
}
