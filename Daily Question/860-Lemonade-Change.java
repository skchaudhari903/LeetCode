/**
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. 
You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int bill : bills)
        {
            if(bill == 5)
                five++;

            else if(bill == 10)
            {
                if(five >= 1)
                {
                    five--;
                    ten++;
                }
                else
                    return false;
            }
            else
            {
                if(ten >= 1 && five >= 1)
                {
                    ten--;
                    five--;
                }
                else if(five >= 3)
                {
                    five = five-3;
                }
                else
                    return false;
            }

        }
        return true;
    }
}
