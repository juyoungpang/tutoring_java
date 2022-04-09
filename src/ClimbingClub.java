import java.util.ArrayList;

public class ClimbingClub extends ClimbInfo{
    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }

    //part a
    /*
    public void addClimb(String peakName, int climbTime){
        ClimbInfo newInfo = new ClimbInfo(peakName,climbTime);
        climbList.add(newInfo);
    }

     */

    //part b
    public void addClimb(String peakName, int climbTime){
        ClimbInfo newInfo = new ClimbInfo(peakName,climbTime);
        int index = 0;
        while(index<climbList.size() && climbList.get(index).getPeakName().compareTo(peakName)<0){
            index++;
        }
        climbList.add(index,newInfo);
    }

    //part c
    //No
    //Yes


}
