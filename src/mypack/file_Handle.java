package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class file_Handle {

    void choice() {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n1 List Of File\n2 Cut/Paste \n3 Copy/Paste\n4 Delete\nEnter Choice :");
        int ch = scan.nextInt();

        if (ch == 1) {

            printFiles(true);

        } else if (ch == 2) {
            cutPasteFileChoice();
        } else if (ch == 3) {
            copyPasteFileChoice();
        } else if (ch == 4) {

        } else {

        }

    }

    void cutPasteFileChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Source file : ");
        String srcFile = scan.nextLine();



        boolean srcFileExist = false;

        if (srcFile.split("\\.").length == 2) {
            srcFileExist = fileExist(srcFile);
        } else {
            srcFile = fileNameCheck(srcFile);
            srcFileExist = !srcFile.isEmpty();
        }


        if(!srcFileExist)
        {
            System.out.println("No file found for cut/paste");
        }
        else
        {
            System.out.println("File found for cut/paste");
            System.out.println("Enter Destination file : ");
            String destFile = scan.nextLine();
            destFile=setDestinationFileName(destFile,srcFile);

            System.out.println("Dest file : "+destFile);
            fileCopy(srcFile, destFile);
            //fileDelete(srcFile);
        }
//		fileNameCheck(destFile);
//


    }

    String setDestinationFileName(String desFile,String srcFile)
    {

        if(desFile.split("\\.").length == 2)
        {
            if(desFile.split("\\.")[1].equals(srcFile.split("\\.")[1]))
            {
                return desFile;
            }
            else
            {
                return desFile.split("\\.")[0]+"."+srcFile.split("\\.")[1];
            }

        }
        else
        {
            return desFile+"."+srcFile.split("\\.")[1];
        }




    }

    boolean fileExist(String file) {
        try {

            File f = new File("folder1/"+file);
            return f.exists();

        } catch (Exception e) {
            return false;
        }
    }

    void copyPasteFileChoice() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Source file : ");
        String srcFile = scan.nextLine();
        System.out.println("Enter Destination file : ");
        String destFile = scan.nextLine();

        fileCopy(srcFile, destFile);

    }

    String fileNameCheck(String file) {
        String name = "";
        String[] files = printFiles(false);

        for (int i = 0; i < files.length; i++) {
            if (file.equals(files[i].split("\\.")[0])) {
                name = files[i];
                break;
            }
        }

        return name;
    }

    void fileDelete(String file) {
        try {
            File f = new File("folder1/" + file);
            f.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fileCopy(String from, String to) {
        try {

            File f = new File("folder1/" + from);
            File destF = new File("folder1/" + to);

            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(destF);

            int n;

            while ((n = fis.read()) != -1) {
                fos.write(n);
            }

            fis.close();
            fos.close();

            System.out.println(to+" File Created");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    String[] printFiles(boolean isPrint) {
        String[] files = null;
        try {
            File f = new File("folder1");
            files = f.list();

            if(isPrint)
                System.out.println("\nFiles of folder\n");

            for (int i = 0; i < files.length; i++) {
                if (isPrint)
                    System.out.println(files[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return files;
    }

}

