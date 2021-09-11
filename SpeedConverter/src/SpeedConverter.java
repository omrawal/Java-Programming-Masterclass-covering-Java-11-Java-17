public class SpeedConverter {
    public static void printConversion(double kilometersPerHour) {
        long ans = toMilesPerHour(kilometersPerHour);
        if (ans != -1)
            System.out.println(kilometersPerHour + " km/h = " + ans + " mi/h");
        else
            System.out.println("Invalid Value");
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long ans = -1L;
        if (kilometersPerHour < 0) {
            ans = -1L;
        } else {
            ans = Math.round((kilometersPerHour / 1.609));
        }
        return ans;
    }
}
