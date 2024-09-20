public class Cricketers {

    String name;
    int age;
    float average;
    int runs;
    int innings;
    int notOuts;
    float strikeRate;
    int highScore;

    public Cricketers(String name, int age, int runs, int innings, int notOuts, float strikeRate, int highScore) {

        this.name = name;
        this.age = age;
        this.runs = runs;
        this.innings = innings;
        this.notOuts = notOuts;
        this.strikeRate = strikeRate;
        this.highScore = highScore;
    }

    public float calculateAverage() {
        return runs / (innings - notOuts);
    }
}
