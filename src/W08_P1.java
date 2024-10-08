public class W08_P1 {
    public static void main(String[] args){
        int year;
        java.util.Calendar current;

        current = java.util.Calendar.getInstance();

        year = current.get(current.YEAR);
        System.out.println("Current Year: "+ year);

    }
}
