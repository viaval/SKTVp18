/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;



import entity.Book;
import entity.Reader;

import java.util.Scanner;



/**

 *

 * @author user

 */

public class ReaderProvider {
    public Reader createReader(){
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        System.out.println("name ");
        reader.setName(scanner.nextLine());
        System.out.println("lastname ");
        reader.setLastname(scanner.nextLine());
        System.out.println("email ");
        reader.email((scanner.nextLine()));
        return reader;
    }
}