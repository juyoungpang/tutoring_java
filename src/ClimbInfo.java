public class ClimbInfo {
    private String peakName;
    private int climbTime;

    public ClimbInfo(){
        peakName = null;
        climbTime=0;
    }
    public ClimbInfo(String peakName, int climbTime){
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    public String getPeakName() {
        return peakName;
    }

    public int getClimbTime() {
        return climbTime;
    }

    public String toString()
    {
        return "Peak name: " + peakName + " time: " + climbTime;
    }
}
