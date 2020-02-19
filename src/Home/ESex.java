package Home;

public enum ESex {
    MALE("Мужской "),
    FEMALE("Женский "),
    Unknown("Неизвестно");



    private String rus;


     ESex(String rus) {
        this.rus = rus;

    }

    public String getRus() {
         return rus;

    }
}
