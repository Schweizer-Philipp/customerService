package customer_service.constraint;

public enum TaxIdConstraints {

    AT("^ATU\\d{8}$"),
    DE("^DE\\d{9}$"),
    DK("^DK\\d{8}$"),
    FR("^FR[\\dA-Za-z]{2}\\d{9}$"),
    GB("^GB(\\d{9}|\\d{12}|[\\dA-Za-z]{5})$"),
    NL("^NL[\\dA-Za-z+*]{10}\\d{2}$");


    private String regex;

    TaxIdConstraints(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
