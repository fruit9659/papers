package com.system.config;

import java.io.*;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   18:10
 */
public class JavaTxtFile {
    public static String readTxtFile(String Textpath) {
        String Text = " ", Line;
        File file = new File(Textpath);
        try {
            FileInputStream fileInput = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fileInput, "UTF-8");
            BufferedReader reader1 = new BufferedReader(reader);
            while ((Line = reader1.readLine()) != null) {
                Text += Line;
            }
            reader.close();
            reader1.close();
            fileInput.close();
        } catch (IOException e) {
            throw new customException(20002, "本系统自定义异常位置->文件为空或者文件路径不存在");
        }
        return Text;
    }

    public static String[] TxtFilePath(String filepath)
    {
        File file=new File(filepath);
        if(file.isFile())
        {
            System.out.println("\t"+file.getName());
            String[] files = new String[1];
            files[0] = file.getAbsolutePath();
            return files;
        }else{
            String[] files=file.list();
            return files;
        }
    }

    public static void writeTxtFile(String FileName,String FileContext){
        if(FileName==null||FileContext==null){
            System.out.println("Please O T Correct Format");
            return;
        }
        File file = new File(FileName);
        BufferedWriter writer=null;
        if(!file.exists()){
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!file.isFile()){
            System.out.println("path is not："+FileName+" file，write Error");
            return;
        }
        try {
            writer=new BufferedWriter(new FileWriter(file));
            writer.write(FileContext);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=writer){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
