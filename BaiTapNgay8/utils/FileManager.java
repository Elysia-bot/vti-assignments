package BaiTapNgay8.utils;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static final String ERROR_FILE_EXIST = "Error! File Exist.";
    public static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String ERROR_FOLDER_EXIST = "Error! Folder Exist.";
    public static final String ERROR_NOT_FOLDER = "Error! Path is not folder.";
    public static final String ERROR_SOURCE_NOT_EXIST = "Error! Source File Not Exist.";
    public static final String ERROR_NAME_EXIST = "Error! Name is Exist.";


    public static boolean isFileExists(String pathFile) {
        return new File(pathFile).exists();
    }


    public static void createNewFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new Exception(ERROR_FILE_EXIST);
        }
        file.createNewFile();
    }

    public static void createNewFile(String path, String fileName) throws Exception {
        createNewFile(path + File.separator + fileName);
    }


    public static void deleteFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }
        file.delete();
    }


    public static boolean isFolder(String path) {
        return new File(path).isDirectory();
    }


    public static List<String> getAllFileName(String path) throws Exception {
        File folder = new File(path);
        if (!folder.isDirectory()) {
            throw new Exception(ERROR_NOT_FOLDER);
        }
        List<String> names = new ArrayList<>();
        for (File file : folder.listFiles()) {
            names.add(file.getName());
        }
        return names;
    }


    public static void copyFile(String sourceFile, String newPath) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists()) {
            throw new Exception(ERROR_SOURCE_NOT_EXIST);
        }
        File dest = new File(newPath);
        if (dest.exists()) {
            throw new Exception("Error! newPath has File same name.");
        }
        Files.copy(source.toPath(), dest.toPath());
    }

    public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
        copyFile(sourceFile, destinationPath + File.separator + newName);
    }


    public static void moveFile(String sourceFile, String destinationPath) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }
        Files.move(source.toPath(),
                Paths.get(destinationPath, source.getName()),
                StandardCopyOption.REPLACE_EXISTING);
    }


    public static void renameFile(String pathFile, String newName) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }
        File newFile = new File(file.getParent(), newName);
        if (newFile.exists()) {
            throw new Exception(ERROR_NAME_EXIST);
        }
        file.renameTo(newFile);
    }


    public static void createNewFolder(String newPathFolder) throws Exception {
        File folder = new File(newPathFolder);
        if (folder.exists()) {
            throw new Exception(ERROR_FOLDER_EXIST);
        }
        folder.mkdirs();
    }


    public static void downloadFile(String fileLink, String folder) throws Exception {
        File dir = new File(folder);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String fileName = fileLink.substring(fileLink.lastIndexOf("/") + 1);
        File file = new File(folder, fileName);
        int count = 1;

        while (file.exists()) {
            String name = fileName.replace(".", "(" + count++ + ").");
            file = new File(folder, name);
        }

        try (InputStream in = new URL(fileLink).openStream()) {
            Files.copy(in, file.toPath());
        }
    }
}
