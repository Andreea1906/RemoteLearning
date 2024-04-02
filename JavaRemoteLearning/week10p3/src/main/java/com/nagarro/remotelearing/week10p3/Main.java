package com.nagarro.remotelearing.week10p3;

import com.nagarro.remotelearing.week10p3.service.TranscodeLatinManager;
import com.nagarro.remotelearing.week10p3.service.TranscodeUTF8Manager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String latinInputFile = "D:\\RemoteLearning\\JavaRemoteLearning\\week10p3\\src\\main\\resources\\input\\latin1input.txt";
        String latinOutputFile = "D:\\RemoteLearning\\JavaRemoteLearning\\week10p3\\src\\main\\resources\\output\\utf8output.txt";
        String utfInputFile = "D:\\RemoteLearning\\JavaRemoteLearning\\week10p3\\src\\main\\resources\\input\\utf8input.txt";
        String utfOutputFile = "D:\\RemoteLearning\\JavaRemoteLearning\\week10p3\\src\\main\\resources\\output\\latin1output.txt";

        try {
            TranscodeLatinManager.transcodeLatin1ToUTF8(latinInputFile, latinOutputFile);
            System.out.println("Latin1 to UTF8 transcoding completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            TranscodeUTF8Manager.transcodeUTF8ToLatin1(utfInputFile, utfOutputFile);
            System.out.println("UTF8 to Latin1 transcoding completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




