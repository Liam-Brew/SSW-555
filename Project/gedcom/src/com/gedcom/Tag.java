package com.gedcom;

/**
 * Enumerated representation of a acceptable tags for a GEDCOM entry.
 *
 * @author Liam Brew
 * @version 1.0
 * @date 14 September 2020
 * @pledge I pledge my honor that I have abided by the Stevens Honor System
 */
public enum Tag {
    INDI,
    NAME,
    SEX,
    BIRT,
    DEAT,
    FAMC,
    FAMS,
    FAM,
    MARR,
    HUSB,
    WIFE,
    CHIL,
    DIV,
    DATE,
    HEAD,
    TRLR,
    NOTE;

    private static final Tag[] VALUES = values();

    public static Boolean contains(String str) {
        for (Tag val : VALUES) {
            try {
                if (Tag.valueOf(str) == val) return true;
            } catch (IllegalArgumentException ex) {
                break;
            }
        }
        return false;
    }
}
