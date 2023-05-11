package Task7_2;

public enum Currency {
//    transferCourse.put("USD", 1.0);
//        transferCourse.put("EUR", 1.2);
//        transferCourse.put("GBP", 1.1);
//        transferCourse.put("AUD", 0.8);
//        transferCourse.put("NZD", 0.9);
//        transferCourse.put("CAD", 0.7);
//        transferCourse.put("CHF", 2.2);
//        transferCourse.put("JPY", 20.0);
    USD(1.0),
    EUR(1.2),
    GBP(1.1),
    AUD(0.8),
    NZD(0.9),
    CAD(0.7),
    CHF(2.2),
    JPY(20.0);

    private final double coef;
    private Currency(double coef){
        this.coef=coef;
    }
}
