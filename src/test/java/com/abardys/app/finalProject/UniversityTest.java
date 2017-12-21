//package com.abardys.app.finalProject;
//
//import junitparams.FileParameters;
//import junitparams.JUnitParamsRunner;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import java.io.*;
//import java.util.*;
//
//import static com.abardys.app.finalProject.University.addPersone;
//
///**
// * Created by anbar on 10-Aug-17.
// */
//@RunWith(JUnitParamsRunner.class)
//public class UniversityTest {
//    public static final String FILEPATH = "src/test/java/resources/universityTest.csv";
//
//    @Before
//    public void setUp(){University university = new University();}
//
//
//    @Test
//    public void readFileTest(){
//        int expRes = 1;
//        Assert.assertEquals(expRes, University.readFile());
//    }
//
//    @Test
//    public void addPersoneTest(){
//
//        Assert.assertEquals(readTestFile(), addPersone());
//
//    }
//
//    public static List<Map> readTestFile() {
//        BufferedReader br = null;
//        FileReader fr = null;
//        String line;
//        List<Map> universityTestList = new ArrayList<>();
//        try {
//            fr = new FileReader(FILEPATH);
//            br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//                String[] str = line.split(",");
//                Map<Headers, String> lineMap = new HashMap();
//                for (int i = 0; i < enumToArray().length; i++) {
//                    Headers a = enumToArray()[i];
//                    String b = str[i];
//                    lineMap.put(a, b);
//                }
//                universityTestList.add(lineMap);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Your file is not found " + e.getMessage());
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if (fr != null) {
//                    fr.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return universityTestList;
//    }
//    public static Headers[] enumToArray() {
//        Headers[] headersArray;
//        headersArray = Headers.values();
//        return headersArray;
//    }
//}
