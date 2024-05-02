public class Lift{
    private int floor[];
    private int access_start;
    private int access_end;
    private int source;
    private int distination;
 

    public Lift(int access_start, int  access_end, int floorv,int source, int destination){
        this.access_end=access_end;
        this.access_start=access_start;
        floor=new int[floorv];
      
       this.source=source;
       this.distination=destination;
    }
    public Lift(int floorv){
       floor =new int[floorv];
       floor[0]=-1;

    }
    public int getAccess_start() {
        return access_start;
    }
    public void setAccess_start(int access_start) {
        this.access_start = access_start;
    }
    public int getAccess_end() {
        return access_end;
    }
    public void setAccess_end(int access_end) {
        this.access_end = access_end;
    }
    public int getSource() {
        return source;
    }
    public void setSource(int source) {
        this.source = source;
    }
    public int getDistination() {
        return distination;
    }
    public void setDistination(int distination) {
        this.distination = distination;
    }
    public int[]  getFloor() {
        return floor;
    }
    public void setFloor(int val) {
        this.floor[val]=val;
    }
    public void setFloorPos(int pos,int val) {
        this.floor[pos]=val;
    }
    
}