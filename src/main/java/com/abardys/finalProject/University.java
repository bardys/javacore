package com.abardys.finalProject;

import java.io.*;
import java.util.*;

/**
 * Created by anbar on 02-Aug-17.
 */
public class University {
    public static final String FILEPATH = "D:\\Projects\\javacore\\src\\main\\java\\resources\\university.csv";
    public static List<Map> universityList = new ArrayList<>();
    public static List<Map> tempUniversityList = new ArrayList<>();
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
                tempUniversityList.add(lineMap);
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
            QualificationWithCourse qualificationWithCourse = null;
            Map<Headers, String> newLineMap = new HashMap();
            for (int i = 0; i < enumToArray().length; i++) {

                if(i == 7) {
                    while (true) {
                        Headers a = enumToArray()[i];
                        System.out.println("Enter " + a + ":");
                        val = scanner.nextLine();
                        if (!val.equals("")){
                            QualificationWithCourse[] qualificationWithCourseArray = QualificationWithCourse.values();
                            for (int j = 0; j < qualificationWithCourseArray.length; j++) {
                                qualificationWithCourse = QualificationWithCourse.values()[j];
                                String course = qualificationWithCourse.getCourse();
                                if (course.equals(val)) {
                                    newLineMap.put(a, val);
                                    break;
                                }
                                qualificationWithCourse = null;
                            }
                        }else{
                            val = " ";
                            newLineMap.put(a, val);
                        }
                        if (newLineMap.containsKey(a)) {
                            break;
                        }else{
                            System.out.println("Wrong course!");
                        }
                    }
                }else if(i == 8) {
                    Headers a = enumToArray()[i];
                    if (qualificationWithCourse != null) {
                        System.out.println(a + ":");
                        System.out.println(qualificationWithCourse);
                        newLineMap.put(a, qualificationWithCourse.toString());
                    }else{
                        while(true) {
                            System.out.println("Enter " + a + ":");
                            val = scanner.nextLine();
                            if (val.equals("")) {
                                val = " ";
                                newLineMap.put(a, val);
                            } else {
                                QualificationWithOutCourse[] qualificationWithOutCourse = QualificationWithOutCourse.values();
                                for (QualificationWithOutCourse value : qualificationWithOutCourse) {
                                    if (val.toUpperCase().equals(value.toString())) {
                                        newLineMap.put(a, val.toUpperCase());
                                    }
                                }
                            }
                            if (newLineMap.containsKey(a)) {
                                break;
                            } else {
                                System.out.println("Wrong qualification!");
                            }
                        }
                    }
                }
                Headers a = enumToArray()[i];
                if (newLineMap.containsKey(a)) {continue;}
                System.out.println("Enter " + a + ":");
                val = scanner.nextLine();

                if(val.equals("")){val = " ";}
                System.out.println(val);
                newLineMap.put(a, val);
                }

            universityList.add(newLineMap);
            tempUniversityList.add(newLineMap);
            System.out.println("New person was added! Continue adding? (y/n)");
            val = scanner.nextLine();
            if(val.equals("y")){continue;}else{break;}

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

    public static void search(Map searchMap, String searchParameter) {
        for (int i = 0; i < enumToArray().length; i++) {
            String cell = searchMap.get(enumToArray()[i]).toString();
            if (searchParameter.toLowerCase().equals(cell.toLowerCase())) {
                displayResults(searchMap);
                break;
            }
        }
    }

    public static void deletePersonMenu(){
        System.out.println("Find person who you want to delete");
        searchMenu();
        System.out.println("Delete displayed persons? (y/n)");
        String deleteAnswer = scanner.nextLine();
        if(deleteAnswer.equals("y")){
            if (searchMenu.equals("1")) {
                for (Map toDeleteMap : tempUniversityList) {
                    deletePerson(toDeleteMap, searchRequest);
                }
                tempUniversityList = universityList;
                System.out.println("\nPersons were deleted");

            } else if (searchMenu.equals("2")) {
                for (Map toDeleteMap : tempUniversityList) {
                    if (!toDeleteMap.get(enumToArray()[8]).toString().equals(" ")) {
                        deletePerson(toDeleteMap, searchRequest);
                    }
                }
                tempUniversityList = universityList;
                System.out.println("\nPersons were deleted");

            }else if (searchMenu.equals("3")) {
                for (Map toDeleteMap : tempUniversityList) {
                    if (!toDeleteMap.get(enumToArray()[9]).toString().equals(" ")) {
                        deletePerson(toDeleteMap, searchRequest);
                    }
                }
                tempUniversityList = universityList;
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

    public static void editPersonMenu(){
        System.out.println("Find person who you want to edit");
        searchMenu();
        System.out.println("Edit displayed persons? (y/n)");
        String editAnswer = scanner.nextLine();
        if(editAnswer.equals("y")){
            if (searchMenu.equals("1")) {
                for (Map toEditMap : universityList) {
                    editPerson(toEditMap, searchRequest);
                }
                tempUniversityList = universityList;
                System.out.println("\nPersons were edited");

            } else if (searchMenu.equals("2")) {
                for (Map toEditMap : universityList) {
                    if (!toEditMap.get(enumToArray()[8]).toString().equals(" ")) {
                        editPerson(toEditMap, searchRequest);
                    }
                }
                tempUniversityList = universityList;
                System.out.println("\nPersons were edited");

            }else if (searchMenu.equals("3")) {
                for (Map toEditMap : universityList) {
                    if (!toEditMap.get(enumToArray()[9]).toString().equals(" ")) {
                        editPerson(toEditMap, searchRequest);
                    }
                }
                tempUniversityList = universityList;
                System.out.println("\nPersons were edited");
            }
        }

    }

    public static void editPerson(Map searchMap, String searchParameter){
        for (int i = 0; i < enumToArray().length; i++) {
            String cell = searchMap.get(enumToArray()[i]).toString();
            if (searchParameter.toLowerCase().equals(cell.toLowerCase())) {
                displayResults(searchMap);
                String val;
                for (int j = 0; j < enumToArray().length; j++) {
                    Headers a = enumToArray()[j];
                    System.out.println("Enter " + a + " or \"s\" to skip:");
                    val = scanner.nextLine();
                    if(val.equals("")){val = " ";
                    }else if(val.equals("s")){continue;}
                    searchMap.put(a, val);
                }
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
        try {
            File file = new File(FILEPATH);
            if (file.exists()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){e.printStackTrace();}

        BufferedWriter bw = null; FileWriter fw = null;
        for(Map rowMap : universityList){
            StringBuilder row = new StringBuilder();
            for(int i=0; i<enumToArray().length; i++){
                String cell = rowMap.get(enumToArray()[i]).toString() + ",";
                row.append(cell);
            }
            try {
                File file = new File(FILEPATH);
                 // true = append file
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write(row.toString() + "\r\n");

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
        addPersone();
        writeFile();

    }
}