/*
 * Copyright (c) 2021. 四川高诚物联网科技有限公司.  All rights reserved.
 * 本软件基于Apache License 2.0
 * 任何单位及个人可以用于修改，分发及商业目的
 */

package org.isdp.vertx.boot.test;

import io.vertx.core.Vertx;
import org.isdp.vertx.boot.annotation.Application;
import org.isdp.vertx.boot.boot.IsdpApplication;



@Application
public class TestBoot{
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        IsdpApplication isdpApplication =  new IsdpApplication();
        isdpApplication.Run(args,TestBoot.class, vertx);
    }
//public class TestBoot  extends AbstractVerticle {
//    private static String exampleDir = "ISDP_MC\\boot\\src\\main\\java\\";

    // Convenience method so you can run it in your IDE
//    public static void main(String[] args) {
////        Launcher.main(new String[] { "run", TestBoot.class.getName(), "-ha"});
//        try {
//            // We need to use the canonical file. Without the file name is .
//            File current = new File(".").getCanonicalFile();
//            System.out.println(current.getName());
//            if (exampleDir.startsWith(current.getName()) && !exampleDir.equals(current.getName())) {
//                exampleDir = exampleDir.substring(current.getName().length() + 1);
//                System.out.println(exampleDir);
//            }
//        } catch (IOException e) {
//            // Ignore it.
//        }
//        System.setProperty("vertx.cwd", exampleDir);
//    }

//    @Override
//    public void start() throws Exception {
//        vertx.createHttpServer().requestHandler(req -> {
//            final String name = ManagementFactory.getRuntimeMXBean().getName();
//            req.response().end("Happily served by " + name);
//        }).listen(8080);
//    }
//public static void main(String[] args) {
//        Launcher.main(new String[]{"bare"});
//}

}
