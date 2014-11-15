package io.vertx.example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerOptions;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldServer {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.createHttpServer(new HttpServerOptions().setPort(8080)).requestHandler(req -> req.response().end("Hello World!")).listen();
  }

}
