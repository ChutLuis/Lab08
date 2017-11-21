
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Felipe Chutá
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        String Ruta;
        
        System.out.println("Type the route of the file");
        
        Ruta = scan.nextLine();
        
        try{
        FileLoader asda = new FileLoader(); 
        DemoGraphviz graph = new DemoGraphviz();
        
        asda.loadFileWithJava7(Ruta);
        
        graph.createDemoFromDot(Ruta);
            
        }
        catch(IOException e){
            System.out.println("This is not a valid route");
        }
        
        
        
        
        
    }
    
}
