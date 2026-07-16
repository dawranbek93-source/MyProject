package Test;

public enum Day{

    MONDAY("Monday", "Понедельник"),
    TUESDAY("Tuesday", "Вторник"),
    WEDNESDAY("Wednesday", "Среда"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "Пятница"),
    SATURDAY("Saturday", "Суббота"),
    SUNDAY("Sunday", "Воскресенье");

        private String en;
        private String ru;

    Day(String en, String ru) {
        this.en = en;
        this.ru = ru;
    }

    public String getEn() {
        return en;
    }

    public String getRu() {
        return ru;
    }


}














