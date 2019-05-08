package com.stackroute.pe3;
import java.lang.*;
import java.io.FileNotFoundException;

public class Try {

    Try(String message) {

        message = "To be execute";
        System.out.println(message);

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

