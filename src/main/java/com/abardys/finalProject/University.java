package com.abardys.finalProject;

import java.io.*;
import java.util.*;

import static com.abardys.finalProject.Headers.FIRST_NAME;

/**
 * Created by anbar on 02-Aug-17.
 */
public class University {
    public static final String FILEPATH = "D:\\Projects\\javacore\\src\\main\\java\\resources\\university.csv";
    public static List<Map> universityList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static String searchMenu;
    public static String searchRequest;


    public static Headers[] enumToArray() {
        Headers[] headersArray = new Headers[11];
        headersArray = Headers.values();
        return headersArray;
    }

    public static void readFile() {
        BufferedReader br = null;
        FileReader fr = null;
        String line;

        try {
            fr = new FileReader(FILEPATH);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                Map<Headers, String> lineMap = new HashMap();
                for (int i = 0; i < enumToArray().length; i++) {
                    Headers a = enumToArray()[i];
                    String b = str[i];
                    lineMap.put(a, b);
                }
                universityList.add(lineMap);
            }
            for(Map rowMap : universityList){
                displayResults(rowMap);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Your file is not found " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void addPersone() {
        while (true) {
            String val;
            Map<Headers, String> newLineMap = new HashMap();
            for (int i = 0; i < enumToArray().length; i++) {
                Headers a = enumToArray()[i];
                System.out.println("Enter " + a + ":");
                val = scanner.nextLine();
                if(val.equals("")){val = " ";}
                System.out.println(val);
                newLineMap.put(a, val);
                }

            universityList.add(newLineMap);
            System.out.println("New person was added! Continue adding? (y/n)");
            val = scanner.nextLine();
            if(val.equals("y")){continue;}else{break;}

        }
    }

    public static void search(Map searchMap, String searchParameter) {
                for (int i = 0; i < enumToArray().length; i++) {
                    String cell = searchMap.get(enumToArray()[i]).toString();
                    if (searchParameter.toLowerCase().equals(cell.toLowerCase())) {
                        displayResults(searchMap);
                        break;
                }
            }
    }

    public static void searchMenu() {
        System.out.println("General search - enter \"1\"");
        System.out.println("Student search - enter \"2\"");
        System.out.println("Employee search - enter \"3\"");
        searchMenu = scanner.nextLine();
        System.out.println("Enter search request:");
        searchRequest = scanner.nextLine();

        if (searchMenu.equals("1")) {
            for (Map rowMap : universityList) {
                search(rowMap, searchRequest);
            }
            System.out.println("\nEnd of search");

        } else if (searchMenu.equals("2")) {
            for (Map rowMap : universityList) {
                if (!rowMap.get(enumToArray()[8]).toString().equals(" ")) {
                    search(rowMap, searchRequest);
                }
            }
            System.out.println("\nEnd of search");

        }else if (searchMenu.equals("3")) {
            for (Map rowMap : universityList) {
                if (!rowMap.get(enumToArray()[9]).toString().equals(" ")) {
                    search(rowMap, searchRequest);
                }
            }
            System.out.println("\nEnd of search");
        }
    }

    public static void deletePersonMenu(){
        System.out.println("Find person who you want to delete");
        searchMenu();
        System.out.println("Delete displayed persons? (y/n)");
        String deleteAnswer = scanner.nextLine();
        if(deleteAnswer.equals("y")){
            if (searchMenu.equals("1")) {
                for (Map rowMap : universityList) {
                    deletePerson(rowMap, searchRequest);
                }
                System.out.println("\nPersons were deleted");

            } else if (searchMenu.equals("2")) {
                for (Map rowMap : universityList) {
                    if (!rowMap.get(enumToArray()[8]).toString().equals(" ")) {
                        deletePerson(rowMap, searchRequest);
                    }
                }
                System.out.println("\nPersons were deleted");

            }else if (searchMenu.equals("3")) {
                for (Map rowMap : universityList) {
                    if (!rowMap.get(enumToArray()[9]).toString().equals(" ")) {
                        deletePerson(rowMap, searchRequest);
                    }
                }
                System.out.println("\nPersons were deleted");
            }
        }

    }

    public static void deletePerson(Map searchMap, String searchParameter){
        for (int i = 0; i < enumToArray().length; i++) {
            String cell = searchMap.get(enumToArray()[i]).toString();
            if (searchParameter.toLowerCase().equals(cell.toLowerCase())) {
                universityList.remove(searchMap);
                break;
            }
        }
    }

    public static void displayResults(Map toDisplayMap) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < enumToArray().length; i++) {
            String cell = toDisplayMap.get(enumToArray()[i]).toString();
            if(cell.equals(" ")){continue;}
            row.append(cell + " ");
        }
        System.out.print(row + "\n");
    }

    public static void writeFile(){

        BufferedWriter bw = null; FileWriter fw = null;
        for(Map rowMap : universityList){
            StringBuilder row = new StringBuilder();
            for(int i=0; i<enumToArray().length; i++){
                String cell = rowMap.get(enumToArray()[i]).toString() + ",";
                row.append(cell);
            }
            try {
                File file = new File(FILEPATH); // if file not exists => create it
                if (!file.exists()) {
                    file.createNewFile();
                } // true = append file

                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write("\r\n" + row.toString());

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null) { bw.close(); }
                    if (fw != null) { fw.close(); }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        readFile();
        deletePersonMenu();
        System.out.println(universityList);
    }
}