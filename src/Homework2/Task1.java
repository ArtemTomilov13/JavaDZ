package Homework2;

import java.util.Scanner;
import java.io.IOException;

import  java.io.*;
import java.util.logging.*;

public class Task1 {

    //public Task1() throws IOException {
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
    public static void recFile(String num) throws IOException {
        try (FileWriter fw = new FileWriter("result.txt", false)) {
            fw.write(num);
            fw.flush();
            fw.close();
        } catch (IOException e1) {
            logging(e1.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        byte num;
        System.out.println("Введите целое число от -128 до 127: ");
        try {
            Scanner scanNum = new Scanner(System.in);
            num = scanNum.nextByte();
            scanNum.close();
            String numStr = Byte.toString(num);
            recFile(numStr);
        } catch (Exception e1) {
            logging(e1.getMessage());
        }
    }
    public static void logging(String args) throws IOException {
        Logger logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "!!!");
    }
}







