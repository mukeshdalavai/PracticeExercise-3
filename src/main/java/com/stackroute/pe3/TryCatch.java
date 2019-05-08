package com.stackroute.pe3;
import java.lang.*;
import java.io.FileNotFoundException;
public class TryCatch {
    TryCatch(String msg) {
        msg = "This is bound to execute";
        System.out.println(msg);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e) {
            throw new Exception("File not found");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

