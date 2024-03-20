public class QuarterOfTheYear {
    public static void main(String[] args) {
        System.out.println(getQuarter("JANUARY"));
        System.out.println(getQuarter("MAY"));
        System.out.println(getQuarter("OCTOBER"));
        System.out.println(getQuarter("DECEMBER"));
        System.out.println(getQuarter("DECCEMBER"));

        System.out.println(getQuarterEnhanced("JANUARY"));
        System.out.println(getQuarterEnhanced("MAY"));
        System.out.println(getQuarterEnhanced("OCTOBER"));
        System.out.println(getQuarterEnhanced("DECEMBER"));
        System.out.println(getQuarterEnhanced("DECCEMBER"));
    }
    public static final String JAN = "JANUARY";
    public static final String FEB = "FEBRUARY";
    public static final String MAR = "MARCH";
    public static final String APR = "APRIL";
    public static final String MAY = "MAY";
    public static final String JUN = "JUNE";
    public static final String JUL = "JULY";
    public static final String AUG = "AUGUST";
    public static final String SEP = "SEPTEMBER";
    public static final String OCT = "OCTOBER";
    public static final String NOV = "NOVEMBER";
    public static final String DEC = "DECEMBER";


    public static String getQuarter(String month) {
        String result;
        switch (month.toUpperCase()) {
            case JAN, FEB, MAR:
                result = "1st";
                break;
            case APR, MAY, JUN:
                result = "2nd";
                break;
            case JUL, AUG, SEP:
                result = "3rd";
            case OCT, NOV, DEC:
                result = "4th";
                break;
            default:
                result = "Bad";
        }
        return result;
    }
    public static String getQuarterEnhanced(String month) {
        return switch (month.toUpperCase()) {
            case JAN, FEB, MAR -> "1st";
            case APR, MAY, JUN -> "2nd";
            case JUL, AUG, SEP -> "3th";
            case OCT, NOV, DEC -> "4th";
            default -> "The given input '" + month + "' is wrong";
        };
    }

}
