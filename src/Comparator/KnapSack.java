package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Item {
    int profit;
    int weight;

    Item(int profit, int weight)
    {
        this.profit = profit;
        this.weight = weight;
    }
}

class MyComp implements Comparator<Item> {
    @Override
    public int compare(Item a,Item b)
    {
        double r1 = (double) a.profit / a.weight;
        double r2 = (double) b.profit / b.weight;

        if(r1 > r2)
            return -1;  //-ve me o1 come first
        else if(r1 < r2)
            return 1; //+ve me o2 comes at second
        else
            return 0;
    }
}
public class KnapSack {
    public static void main(String[] args) {
        int[] profit = {100, 60, 100, 200};
        int[] wt = {20, 10, 50, 50};
        int capacity = 90;

        int n = profit.length;
        List<Item> li = new ArrayList<>();
        for(int i=0;i<n;i++)
            li.add(new Item(profit[i],wt[i]));


        li.sort(new MyComp());
        double total = 0.0;

        for(int i=0;i<wt.length;i++)
        {
            if(capacity >= li.get(i).weight)
            {
                capacity = capacity - li.get(i).weight;
                total += li.get(i).profit;
            }
            else
            {
                //Take the fractional value
                total += (((double) li.get(i).profit / (double) li.get(i).weight )* capacity);
                break;
            }
        }

        System.out.println("Total is "+total);

    }
}
