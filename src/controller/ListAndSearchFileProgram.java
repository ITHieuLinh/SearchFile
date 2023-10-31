/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Repository.FileRepository;
import view.Menu;

public class ListAndSearchFileProgram extends Menu<String>{
    static String[] mc = {"Count Word In File", "Find File by Word", "Exit"};
    Library l;
    private FileRepository program;

    public ListAndSearchFileProgram() {
        super("\nWord Program", mc);
        l = new Library();
        program = new FileRepository();
    }
    
    
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.countWordInFile();
                break;
            case 2:
                program.findFileNameByWord();
                break;
            case 3:
                System.exit(0);
        }
    }
}
