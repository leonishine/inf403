package ru.itis.inf403.lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
    public static void match(Pattern pattern, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.reset();
        int finded = 0;
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find() && finded < 5) {
                //System.out.println(line.substring(matcher.start(), matcher.end()));
                System.out.print(lines + ": ");
                ColoredPrint.print(line, matcher.start(), matcher.end());
                finded++;
            }
        }
    }

    public static String makePattern(String s){
        return "(^| |\")(" + s.substring(0,1).toUpperCase() + "|" + s.substring(0,1).toLowerCase() + ")" + s.substring(1) + "([,;:!?.]|$| |\")";
    }
}