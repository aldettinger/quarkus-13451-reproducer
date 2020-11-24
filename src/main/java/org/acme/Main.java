package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        System.out.println("--------------------------------------");
        System.out.println("From Main");
        System.out.println("args.length:" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
        System.out.println("--------------------------------------");

        Quarkus.run(HelloWorldMain.class, args);
    }

}
