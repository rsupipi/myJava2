package H_Regex.example.z_Test;

public enum Language {
    ENGLISH("en"),
    ARABIC("ar");

    private String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
