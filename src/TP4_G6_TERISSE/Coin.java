package TP4_G6_TERISSE;

public class Coin {

        public int combinationCount(int[] coins, float amount, int index) {
            if (index == coins.length - 1) {
                if (amount % coins[index] == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
            int nbOfCombinations = 0;
            for (int i = 0; i * coins[index] <= amount; i++) {
                nbOfCombinations += combinationCount(coins, amount - i * coins[index], index + 1);
            }

            return nbOfCombinations;

        }

    public static void main(String[] args) {
        Coin coin = new Coin();
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 10000;
        int nbOfCombinations = coin.combinationCount(coins, amount, 0);
        System.out.println("The number of combinations is: " + nbOfCombinations);
    }

}


