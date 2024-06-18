package in.phani.graalvm.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Todos {
    List<Todo> todos;
}
