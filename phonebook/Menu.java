package phonebook;

import java.util.Scanner;
import java.util.logging.*;

public class Menu {
    public static void menu(){
        LoggerClass.logger.log(Level.INFO, "Start menu");
        Phonebook phones = new Phonebook();
        FileIOMenedger run = new FileIOMenedger();
        boolean cycle = true;
        while (cycle) {
            Scanner in = new Scanner(System.in);
            System.out.println(". ".repeat(15)+".");
            System.out.println("\t1 - Добавить абонентов в справочник");
            System.out.println("\t2 - Отобразить справочник");
            System.out.println("\t3 - Записать данные в файл");
            System.out.println("\t4 - Загрузить данные из файла");
            System.out.println("\t5 - Выйти из программы");
            System.out.println(". ".repeat(15)+".");
            System.out.print("Выберите действие: ");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    phones.AddPersons();
                    break;
                case 2:
                    phones.showAddressBook();
                    break;
                case 3:
                    //phones.AddPersons();
                    run.fileExport(phones.pb);
                    System.out.println("Export finish");
                    break;
                case 4:
                    //phones.AddPersons();
                    run.fileImport(phones.pb);
                    phones.showAddressBook();
                    break;
                case 5:
                    cycle = false;
                    break;
            }
        }
        LoggerClass.logger.log(Level.INFO, "Stop menu");
    }
    
}
