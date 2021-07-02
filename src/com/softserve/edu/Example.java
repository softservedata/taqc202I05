package com.softserve.edu;

import java.util.Scanner;

public class Example {
    private int i; // = 0;

    public void myprint(String msg) {
        System.out.println(msg + " i = " + i);
    }

    /**
     * <font color="red">Super End</font>
     */
    public static void end() {
        System.out.println("done");
    }

    /**
     * <font color="red">Super Class</font>
     * @param  args      Comment
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int k = 1;
        System.out.println("k = " + k);
        System.out.println("Hello");
        Example ex = new Example();
        Example ex2 = new Example();
        ex.i = 123;
        ex2.i = 432;
        // System.out.println("ex.i = " + ex.i);
        // System.out.println("ex2.i = " + ex2.i);
        ex.myprint("ex");
        ex2.myprint("ex2");
        //
        if (args.length > 0) {
            System.out.println("Comman line arguments:");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        //
        // end();
        Example.end();
        // ex.end();
        // Thread.sleep(1000);
        //
        byte b = 50;
        System.out.println("b = " + b + " (char) b = " + ((char) b));
        //
        /*-
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("k = ");
        String text = br.readLine();
        k = Integer.parseInt(text);
        System.out.println("k + 1 = " + (k + 1));
        br.close();
        */
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        String text = sc.nextLine();
        k = Integer.parseInt(text);
        System.out.println("k + 1 = " + (k + 1));
        sc.close();
        //
    }

}
