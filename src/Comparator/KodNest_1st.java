package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    int priority;
    int duration;
    int cost;

    Task(int priority, int duration,int cost)
    {
        this.priority = priority;
        this.duration = duration;
        this.cost = cost;
    }
}
public class KodNest_1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Task> tasks = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            tasks.add(new Task(a,b,c));
        }

        int maxDur = sc.nextInt();

        //Sort them on priority (descending) and then by duration (ascending)
        tasks.sort((a,b) -> {
            //Write code here
            if(a.priority != b.priority)
            {
                return b.priority - a.priority;
            }
            else
                return a.duration - b.duration;
        });

        for (Task t1: tasks)
        {
            System.out.println("Task: Priority "+t1.priority+", Duration "+t1.duration+", Cost "+t1.cost);
        }

        int maxCost = 0;
        for(Task t1: tasks)
        {
            if(maxDur < t1.duration)
                maxCost += 50;

            maxCost += t1.cost;
        }


        System.out.println("Total Project Cost: "+maxCost);



    }
}
