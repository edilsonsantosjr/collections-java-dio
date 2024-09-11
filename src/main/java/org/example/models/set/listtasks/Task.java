package org.example.models.set.listtasks;

import java.util.Objects;

public class Task {

    private String description;
    private boolean done;

    public Task(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getDescription(), task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "task{" +
                "description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
