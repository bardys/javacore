package com.abardys.lesson17.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by User on 31.07.2017.
 */
public class Phonebook {
    public static void phonebook() {
        Map<String, Map<String, Map<String, String>>> categories = new HashMap<>();


        String cat = "";
        String nam = "";
        String num = "";
        String mar = "";
        String changeCat = "";
        String newCat = "";
        String changeNam = "";
        String newNam = "";
        String changeNum = "";
        String newNum = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press \"Enter\" to exit");

        if (!categories.isEmpty()) {
            System.out.println("Your categories:");
            System.out.println(categories.keySet());

        } else {
            System.out.println("You have no categories!");
        }

        while (true) {
            System.out.println("Enter category:");
            cat = scanner.nextLine();

            if (!cat.equals("exit") && !cat.equals("")) {

                //                category exist

                if (categories.containsKey(cat)) {
                    System.out.println(categories.get(cat));
                    System.out.println("To change category name print \"change\"");
                    System.out.println("To delete category print \"delete\"");
                    System.out.println("To continue print \"continue\"");
                    changeCat = scanner.nextLine();
                    if (changeCat.equals("change")) {
                        System.out.println("Enter new category name:");
                        newCat = scanner.nextLine();
                        categories.put(newCat, categories.remove(cat));
                        System.out.println("Category \"" + cat + "\" was renamed to category \"" + newCat + "\"!");
                        cat = newCat;
                        System.out.println(categories.keySet());
                    } else if (changeCat.equals("delete")) {
                        categories.remove(cat);
                        System.out.println("Category \"" + cat + "\" was deleted!");
                        System.out.println(categories.keySet());
                    } else if (changeCat.equals("continue")) {

//                        category exist, continue work with category

                        while (true) {
                            System.out.println("Enter name:");
                            nam = scanner.nextLine();
                            if (!nam.equals("exit") && !nam.equals("")) {

//                                category exist, continue work with category, name exist

                                if (categories.get(cat).containsKey(nam)) {
                                    System.out.println(categories.get(cat).get(nam));
                                    System.out.println("To change name print \"change\"");
                                    System.out.println("To delete name print \"delete\"");
                                    System.out.println("To continue print \"continue\"");
                                    changeNam = scanner.nextLine();
                                    if (changeNam.equals("change")) {
                                        System.out.println("Enter new name:");
                                        newNam = scanner.nextLine();
                                        categories.get(cat).put(newNam, categories.get(cat).remove(nam));
                                        System.out.println("Name \"" + nam + "\" was renamed to \"" + newNam + "\"!");
                                        nam = newNam;
                                        System.out.println(categories.get(cat).keySet());
                                    } else if (changeNam.equals("delete")) {
                                        categories.get(cat).remove(nam);
                                        System.out.println("Name \"" + nam + "\" was deleted!");
                                        System.out.println(categories.get(cat).keySet());
                                    } else if (changeNam.equals("continue")) {

//                                        category exist, continue work with category, name exist, continue work with name

                                        while (true) {
                                            System.out.println("Enter phone number");
                                            num = scanner.nextLine();
                                            if (!num.equals("exit") && !num.equals("")) {

//category exist, continue work with category, name exist, continue work with name, number exist

                                                if (categories.get(cat).get(nam).containsKey(num)) {
                                                    System.out.println(num + " " + categories.get(cat).get(nam).get(num));

                                                    System.out.println("To change phone number print \"change\"");
                                                    System.out.println("To delete phone number print \"delete\"");
                                                    changeNum = scanner.nextLine();
                                                    if (changeNum.equals("change")) {
                                                        System.out.println("Enter new phone number:");
                                                        newNum = scanner.nextLine();
                                                        System.out.println("Enter mark");
                                                        mar = scanner.nextLine();
                                                        categories.get(cat).get(nam).put(newNum, mar);
                                                        categories.get(cat).get(nam).remove(num);
                                                        System.out.println("Phone number \"" + num + "\" was renamed to \"" + newNum + "\"!");
                                                        num = newNum;
                                                        System.out.println(num + " " + categories.get(cat).get(nam).get(num));
                                                    } else if (changeNum.equals("delete")) {
                                                        categories.get(cat).get(nam).remove(num);
                                                        System.out.println("Phone number \"" + num + "\" was deleted!");
                                                        System.out.println(categories.get(cat).get(nam));

                                                    } else {
                                                        break;
                                                    }
                                                }else {
                                                    System.out.println("Enter mark");
                                                    mar = scanner.nextLine();
                                                    categories.get(cat).get(nam).put(num, mar);
                                                    System.out.println("New phone number was added!");
                                                }
                                            }else {
                                                break;
                                            }
                                        }
                                    }


//                                                category exist, continue work with category, name NOT exist


                                } else {
                                    Map<String, String> phones = new HashMap<>();
                                    categories.get(cat).put(nam, phones);
                                    System.out.println("New name was added!");
                                    while (true) {
                                        System.out.println("Enter phone number");
                                        num = scanner.nextLine();
                                        if (!num.equals("exit") && !num.equals("")) {
                                            if (categories.get(cat).get(nam).containsKey(num)) {
                                                System.out.println(num + " " + categories.get(cat).get(nam).get(num));

                                                System.out.println("To change phone number print \"change\"");
                                                System.out.println("To delete phone number print \"delete\"");
                                                changeNum = scanner.nextLine();
                                                if (changeNum.equals("change")) {
                                                    System.out.println("Enter new phone number:");
                                                    newNum = scanner.nextLine();
                                                    System.out.println("Enter mark");
                                                    mar = scanner.nextLine();
                                                    categories.get(cat).get(nam).put(newNum, mar);
                                                    categories.get(cat).get(nam).remove(num);
                                                    System.out.println("Phone number \"" + num + "\" was renamed to \"" + newNum + "\"!");
                                                    num = newNum;
                                                    System.out.println(num + " " + categories.get(cat).get(nam).get(num));
                                                } else if (changeNum.equals("delete")) {
                                                    categories.get(cat).get(nam).remove(num);
                                                    System.out.println("Phone number \"" + num + "\" was deleted!");
                                                    System.out.println(categories.get(cat).get(nam));

                                                } else {
                                                    break;
                                                }
                                            } else {
                                                System.out.println("Enter mark");
                                                mar = scanner.nextLine();
                                                categories.get(cat).get(nam).put(num, mar);
                                                System.out.println("New phone number was added!");
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }

                    }

//                                    category NOT exist

                } else {
                    Map<String, Map<String, String>> names = new HashMap<>();
                    categories.put(cat, names);
                    System.out.println("New category was added!");
                    while (true) {
                        System.out.println("Enter name:");
                        nam = scanner.nextLine();
                        if (!nam.equals("exit") && !nam.equals("")) {

//                                            category NOT exist, name exist

                            if (categories.get(cat).containsKey(nam)) {
                                System.out.println(categories.get(cat).get(nam));
                                System.out.println("To change name print \"change\"");
                                System.out.println("To delete name print \"delete\"");
                                System.out.println("To continue name print \"continue\"");
                                changeNam = scanner.nextLine();
                                if (changeNam.equals("change")) {
                                    System.out.println("Enter new name:");
                                    newNam = scanner.nextLine();
                                    categories.get(cat).put(newNam, categories.get(cat).remove(nam));
                                    System.out.println("Name \"" + nam + "\" was renamed to \"" + newNam + "\"!");
                                    nam = newNam;
                                    System.out.println(categories.get(cat).keySet());
                                } else if (changeNam.equals("delete")) {
                                    categories.get(cat).remove(nam);
                                    System.out.println("Name \"" + nam + "\" was deleted!");
                                    System.out.println(categories.get(cat).keySet());
                                } else if (changeNam.equals("continue")) {

//                                                    category NOT exist, name exist, continue work with name


                                    while (true) {
                                        System.out.println("Enter phone number");
                                        num = scanner.nextLine();
                                        if (!num.equals("exit") && !num.equals("")) {

//                                                            category NOT exist, name exist, continue work with name, phone number exist

                                            if (categories.get(cat).get(nam).containsKey(num)) {
                                                System.out.println(num + " " + categories.get(cat).get(nam).get(num));

                                                System.out.println("To change phone number print \"change\"");
                                                System.out.println("To delete phone number print \"delete\"");
                                                changeNum = scanner.nextLine();
                                                if (changeNum.equals("change")) {
                                                    System.out.println("Enter new phone number:");
                                                    newNum = scanner.nextLine();
                                                    System.out.println("Enter mark");
                                                    mar = scanner.nextLine();
                                                    categories.get(cat).get(nam).put(newNum, mar);
                                                    categories.get(cat).get(nam).remove(num);
                                                    System.out.println("Phone number \"" + num + "\" was renamed to \"" + newNum + "\"!");
                                                    num = newNum;
                                                    System.out.println(num + " " + categories.get(cat).get(nam).get(num));
                                                } else if (changeNum.equals("delete")) {
                                                    categories.get(cat).get(nam).remove(num);
                                                    System.out.println("Phone number \"" + num + "\" was deleted!");
                                                    System.out.println(categories.get(cat).get(nam));
                                                } else {
                                                    break;
                                                }

//                                                                category NOT exist, name exist, continue work with name, phone number NOT exist

                                            } else {
                                                System.out.println("Enter mark");
                                                mar = scanner.nextLine();
                                                categories.get(cat).get(nam).put(num, mar);
                                                System.out.println("New phone number was added!");
                                            }

                                        } else {
                                            break;
                                        }
                                    }

                                }


                            } else {
                                Map<String, String> phones = new HashMap<>();
                                categories.get(cat).put(nam, phones);
                                System.out.println("New name was added!");
                                while (true) {
                                    System.out.println("Enter phone number");
                                    num = scanner.nextLine();
                                    if (!num.equals("exit") && !num.equals("")) {
                                        if (categories.get(cat).get(nam).containsKey(num)) {
                                            System.out.println(num + " " + categories.get(cat).get(nam).get(num));

                                            System.out.println("To change phone number print \"change\"");
                                            System.out.println("To delete phone number print \"delete\"");
                                            changeNum = scanner.nextLine();
                                            if (changeNum.equals("change")) {
                                                System.out.println("Enter new phone number:");
                                                newNum = scanner.nextLine();
                                                System.out.println("Enter mark");
                                                mar = scanner.nextLine();
                                                categories.get(cat).get(nam).put(newNum, mar);
                                                categories.get(cat).get(nam).remove(num);
                                                System.out.println("Phone number \"" + num + "\" was renamed to \"" + newNum + "\"!");
                                                num = newNum;
                                                System.out.println(num + " " + categories.get(cat).get(nam).get(num));
                                            } else if (changeNum.equals("delete")) {
                                                categories.get(cat).get(nam).remove(num);
                                                System.out.println("Phone number \"" + num + "\" was deleted!");
                                                System.out.println(categories.get(cat).get(nam));

                                            } else {
                                                break;
                                            }
                                        } else {
                                            System.out.println("Enter mark");
                                            mar = scanner.nextLine();
                                            categories.get(cat).get(nam).put(num, mar);
                                            System.out.println("New phone number was added!");
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }

            } else {
                System.out.println("Bye!");
                break;
            }

        }
    }
}

