package pluralsight.lambda;

/**
 * Created by mahady on 30/05/16.
 */

import java.io.File;
import java.io.FileFilter;


public class FirstLambda {

    public static void main(String[] args) {

//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("/home/mahady/javatutorials/Java8Tutorial/src/pluralsight/module1");
        File[] files = dir.listFiles(filterLambda);

        for (File f : files) {
            System.out.println(f);
        }

    }
}
