package java_8_functions_questions;
/*
Given a list of file names, use a Predicate to filter and print only the file
names with a specific file extension (e.g., ".txt", ".java").
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FileFilterByExtension {
    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>();
        fileNames.add("document.txt");
        fileNames.add("code.java");
        fileNames.add("image.png");
        fileNames.add("notes.txt");
        fileNames.add("report.doc");

        // Define the Predicate to filter file names by extension
        Predicate<String> txtExtensionFilter = fileName -> fileName.endsWith("txt");

        // Filter and print file names with the ".txt" extension
        System.out.println("File Names with '.txt' Extension:");
        fileNames.stream().filter(txtExtensionFilter).forEach(System.out::println);

    }
}
