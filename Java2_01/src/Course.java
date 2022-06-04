public class Course {

    String result;
    private int necessaryRunDistance;
    private int necessarySwimDistance;
    private int necessaryJumpHeight;

    public Course(int necessaryRunDistance, int necessarySwimDistance, int necessaryJumpHeight){
        this.necessaryRunDistance = necessaryRunDistance;
        this.necessarySwimDistance = necessarySwimDistance;
        this.necessaryJumpHeight = necessaryJumpHeight;
    }

    public String doIt(Team team){
        result = "Team: "+team.getName()+" "+ '\n';
        for(Member member: team.getMembers()){
            result +="Competitor's name: "+member.getName()+ " " + '\n';
            int value1 = member.getRunDistance();
            run(value1);

            int value2 = member.getSwimDistance();
            swim(value2);

            int value3 = member.getJumpHeight();
            jump(value3);
        }
        return result;
    }

    private void run(int value){
        if (value>=necessaryRunDistance){
            result += "The competitor has successfully run the required distance"+ '\n';
        }
        else
            result += "The competitor was unable to run the required distance"+ '\n';
    }

    private void swim(int value){
        if (value>=necessarySwimDistance){
            result += "The competitor has successfully swum the required distance"+ '\n';
        }
        else
            result += "The competitor was unable to swim the required distance"+ '\n';
    }

    private void jump(int value){
        if (value>=necessaryJumpHeight){
            result += "The competitor has successfully jumped the required height"+ '\n';
        }
        else
            result += "The competitor was unable to jump to the required height"+ '\n';
    }

}
