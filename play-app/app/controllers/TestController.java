package controllers;

import play.mvc.*;

import views.html.*;

public class TestController extends Controller {

    public Result index() {
        return ok("Got request " + request() + "!");
    }


    public Result alive() {
        return ok("I'm Alive !");
    }

    public Result hello(String name) {
        return ok("Hello " + name + " !");
    }
    
    public Result unknown() {
        return notFound("<h1>OUPS !!!!</h1>").as("text/html");
    }
    
    public Result redirect() {
        //return redirect("/alive");
        //return temporaryRedirect("/alive");
        return redirect(controllers.routes.TestController.hello("Redirect link"));
    }
    
}
