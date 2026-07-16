package Test;

public enum Season{

    WINTER("холодно"),
    SPRING("тепло"),
    SUMMER("тепло"),
    AUTUMN("холодно");

    private String russianName;

    Season(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public boolean isCold () {
        return this == WINTER || this == AUTUMN;

    }
}
