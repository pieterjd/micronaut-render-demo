package be.pieterjd.hello;

import java.util.Map;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import jakarta.annotation.Nonnull;

@Controller
public class HelloViewController {
    @View("index.html")
    @Get(value="/hello/{name}", produces=MediaType.TEXT_HTML)
    Map<String, String> index(@Nonnull String name){
        return Map.of("message", String.format("Hello %s", name));
    }
}
