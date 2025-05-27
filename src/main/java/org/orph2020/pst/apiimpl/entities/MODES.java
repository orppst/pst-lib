package org.orph2020.pst.apiimpl.entities;

import java.util.Arrays;

public enum MODES {
    OPTICAL("OPTICAL", 0),
    RADIO("RADIO", 1),
    BOTH("BOTH", 2);

    private final String text;
    private final int number;

    MODES(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return number;
    }

    /**
     * Helper method to get MODES enum from its integer value.
     * @param value The integer value.
     * @return The corresponding MODES enum.
     * @throws IllegalArgumentException if no MODES enum with the given value exists.
     */
    public static MODES fromValue(int value) {
        for (MODES mode : MODES.values()) {
            if (mode.getValue() == value) {
                return mode;
            }
        }
        throw new IllegalArgumentException("No MODES enum with value " + value);
    }

    /**
     * Helper method to get MODES enum from its string text (case-insensitive).
     * @param text The string text.
     * @return The corresponding MODES enum.
     * @throws IllegalArgumentException if no MODES enum with the given text exists.
     */
    public static MODES fromText(String text) {
        return Arrays.stream(MODES.values())
            .filter(mode -> mode.getText().equalsIgnoreCase(text))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "No MODES enum with text " + text));
    }
}
