package in.phani.graalvm.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Todo {
    private int id;
    private String todo;
    private boolean completed;
    private int userId;
}
