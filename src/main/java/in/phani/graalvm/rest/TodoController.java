package in.phani.graalvm.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.phani.graalvm.model.Todos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@RestController
public class TodoController {

    @Value("classpath:todos.json")
    public Resource jsonFile;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String hello() {
        return "hello todos";
    }

    @GetMapping("/port")
    public String getPort() {
        return environment.getProperty("local.server.port");
    }

    @GetMapping("/todos")
    public Todos todos() {
        try (Reader reader = new InputStreamReader(jsonFile.getInputStream(), UTF_8)) {
            return objectMapper.readValue(reader, Todos.class);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
