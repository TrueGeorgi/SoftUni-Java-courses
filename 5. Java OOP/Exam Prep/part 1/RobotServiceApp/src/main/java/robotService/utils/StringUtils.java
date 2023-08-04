package robotService.utils;

import robotService.common.ExceptionMessages;

public class StringUtils {

    public StringUtils() {}

    public static String notNullOrWhiteSpaceInput (String input, String exceptionMessage) {

        if (input == null || input.trim().isEmpty()) {
            throw new NullPointerException(exceptionMessage);
        }
        return input;
    }
}
