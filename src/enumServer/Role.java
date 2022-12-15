package enumServer;

public enum Role {
    TEACHER(3),
    SENIOR(2),
    JUNIOR(1);

    private int rank;

    Role(int rnk){
        rank = rnk;
    }

    public int getRole(){
        return rank;
    }

}
