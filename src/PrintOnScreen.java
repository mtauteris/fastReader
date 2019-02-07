/**
 * Created by Minde on 2019.02.07.
 */
public class PrintOnScreen {

    public static void printOnScreen(String [] words) throws InterruptedException{

        for (String word :words){
            System.out.flush();
//                    System.out.print("\033[H\033[2J");
            System.out.println(word);
            Thread.sleep(5);

        }
    }
}
