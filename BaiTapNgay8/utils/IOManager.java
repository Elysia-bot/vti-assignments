package BaiTapNgay8.utils;


import java.io.*;

public class IOManager {

    public static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String ERROR_OBJECT_NULL = "Error! Object is Null.";


    public static String readFile(String pathFile) throws Exception {
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }


    public static void writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        try (FileWriter fw = new FileWriter(pathFile, isContinuing)) {
            fw.write(content);
        }
    }


    public static void writeObject(Object object, String path, String fileName) throws Exception {
        if (object == null) {
            throw new Exception(ERROR_OBJECT_NULL);
        }

        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(path + File.separator + fileName))) {
            oos.writeObject(object);
        }
    }


    public static Object readObject(String filePath) throws Exception {
        if (!FileManager.isFileExists(filePath)) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return ois.readObject();
        }
    }
}
