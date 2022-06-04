public class Team {

    private String teamName;
    private Member[] members;

    public Team(String teamName, Member[] members) {
        this.teamName = teamName;
        this.members = members;
    }

    public String getName() {
        return teamName;
    }

    public Member[] getMembers() {
        return members;
    }
}
