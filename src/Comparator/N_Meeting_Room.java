package Comparator;

import java.util.ArrayList;

class Meet {
    int start;
    int end;
    int ind;

    Meet(int start,int end,int ind)
    {
        this.start = start;
        this.end = end;
        this.ind = ind;
    }
}
public class N_Meeting_Room {
    public static void main(String[] args) {
        int n = 6;
        int[] start = {0,3,1,5,5,8};
        int[] end = {5,4,2,9,7,9};
        maxMeetings(start,end,n);
    }

    private static void maxMeetings(int[] start,int[] end,int n)
    {
        ArrayList<Meet> meets = new ArrayList<>();
        for(int i=0;i<n;i++) {
            meets.add(new Meet(start[i],end[i],i+1));
        }

        // Sort on based on end time
        meets.sort((a,b) -> a.end - b.end);
        for(Meet m : meets) {
            System.out.println("Meeting " + m.ind + ": Start = " + m.start + ", End = " + m.end);
        }


        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meets.get(0).ind);
        int freeTime = meets.get(0).end;
        int cnt = 1;

        for(int i=1;i<n;i++)
        {
            if(freeTime < meets.get(i).start)
            {
                cnt +=1;
                freeTime = meets.get(i).end;
                ans.add(meets.get(i).ind);
            }
        }

        System.out.println("Count is "+cnt);
        System.out.println("Meetings happens are "+ans);


    }
}
