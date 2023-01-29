package phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;

public class FileIOMenedger {
    String FILE_PATH = "./phonebook/Data/";
    String FILE_NAME_EXPORT = "Data.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    
    public void fileExport(ArrayList<Persona> pb){
        LoggerClass.logger.log(Level.INFO, "Data is written to the file");
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))
        {
            // запись всей строки
//            String text = "Hello Gold!";
            for(Persona i: pb){
                String text = i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
//                writer.append('E');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public void fileImport(ArrayList<Persona> pb){
        LoggerClass.logger.log(Level.INFO, "Data loaded from the file");
        try {
            File file = new File(FILE_PATH_FULL);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);

                String[] tmp = line.split(";");

                pb.add(new Persona(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
