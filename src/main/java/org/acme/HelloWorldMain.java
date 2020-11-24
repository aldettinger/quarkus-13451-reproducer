package org.acme;

import io.quarkus.runtime.QuarkusApplication;

//@QuarkusMain
public class HelloWorldMain implements QuarkusApplication {

    @Override
    public int run(String... args) {
        System.out.println("--------------------------------------");
        System.out.println("From HellowWorldMain");
        System.out.println("args.length:" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
        System.out.println("--------------------------------------");
        return 0;
    }

}
