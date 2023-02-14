package com.design.pattern.CreationalPatterns.factorymethod._03_java;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass()); // GregorianCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass()); // BuddhistCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass()); // JapaneseImperialCalendar
    }
}
