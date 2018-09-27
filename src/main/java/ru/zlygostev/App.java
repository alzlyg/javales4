package ru.zlygostev;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Chat dialog = new Chat();
        dialog.pack();
        dialog.setSize(450, 300);
        dialog.setVisible(true);

        System.exit(0);
//        System.out.println( "Hello World!" );
    }
}
