package io.vertx.example;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerOptions;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldServer extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer(new HttpServerOptions().setPort(8080)).requestHandler(req -> req.response().end("Hello World!")).listen();
  }

}
