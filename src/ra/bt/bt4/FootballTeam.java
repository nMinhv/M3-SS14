package ra.bt.bt4;

public class FootballTeam {
    private int id;
    private String name;
    private double score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public void display() {
        System.out.printf("id: %d, name: %s, score: %.2f\n", this.id, this.name, this.score);
    }







}
