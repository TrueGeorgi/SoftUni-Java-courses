package AE02_VehiclesExtension;

import java.text.DecimalFormat;

public class Utils {

    public static String formatDouble (double toBeFormatted) {
        DecimalFormat format = new DecimalFormat("#.##");
        format.setDecimalSeparatorAlwaysShown(false);
        return format.format(toBeFormatted);
    }
}
