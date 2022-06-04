public class Main {

    public static void main(String[] args){
        Member[] member = new Member[4];
        member[0]= new Member("Cho Myong-Nok", 1000, 100,1);
        member[1] = new Member("Han Song-Taek", 2000, 200, 2);
        member[2] = new Member("Kim Jong-Un", 3000, 300, 1);
        member[3] = new Member("Pak Nam-Sun", 4000, 400, 4);
        Team team = new Team("North Korea is best Korea!", member);

        Course course = new Course(2000,200,2);
        String result = course.doIt(team);
        System.out.println(result);

    }
}
