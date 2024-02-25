package LEC_65;

public class Coin_Change_II {
    public static void main(String[] args) {
        int [] arr ={1,2,5};
        int amount =5;
        int [][] dp = new int[amount+1][arr.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;

            }
        }
        System.out.println(Coin(arr,5,0,dp));
    }
    public static int CoinChangesBU(int[] coin, int amount) {
        int[][] dp = new int[amount + 1][coin.length + 1];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int am = 1; am < dp.length; am++) {// amount ka track
            for (int i = 1; i < dp[0].length; i++) {// coin ka track
                int inc = 0;
                int exc = 0;
                if (am >= coin[i - 1]) {
                    inc = dp[am - coin[i - 1]][i];
                }
                exc = dp[am][i - 1];
                dp[am][i] = inc + exc;

            }
        }

        return dp[amount][coin.length];

    }
    public static int Coin(int [] coint ,int amount,int i,int [][] dp){

        if(amount ==0){
            return 1;
        }
        int inc =0, exc=0;
        if(i == coint.length){
            return 0;
        }
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        if(amount>=coint[i]){
            inc= Coin(coint, amount- coint[i],i,dp);


        }
        exc=Coin(coint,amount,i+1,dp);
        return dp[amount][i]=inc + exc;




    }
}
