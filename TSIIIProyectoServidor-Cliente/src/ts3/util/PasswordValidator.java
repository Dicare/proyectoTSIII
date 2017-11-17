package ts3.util;

import java.util.regex.Pattern;

public class PasswordValidator
{
    // 4-8 character password requiring numbers and alphabets of both cases
    private static final String PASSWORD_REGEX
            = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,32}$";

    // 4-32 character password requiring at least 3 out of 4 (uppercase and lowercase
    // letters, numbers & special characters) and at-most 2 equal consecutive chars.
    private static final String COMPLEX_PASSWORD_REGEX
            = "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|"
            + "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|"
            + "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|"
            + "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})"
            + "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]"
            + "{8,32}$";

    public static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
}
