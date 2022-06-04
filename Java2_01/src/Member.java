public class Member {

    String name;
    int runDistance;
    int swimDistance;
    int jumpHeight;


    public Member(String name, int runDistance, int swimDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    public void teamInfo(){
        System.out.println("Name: " + name + ", Max. run distance: "+runDistance+", Max. swim distance: "+swimDistance+
                ", Max. jump height: "+jumpHeight);
    }

    public String getName(){
        return name;
    }

    public int getRunDistance(){
        return runDistance;
    }

    public  int getSwimDistance(){
        return swimDistance;
    }

    public int getJumpHeight(){
        return jumpHeight;
    }
}
