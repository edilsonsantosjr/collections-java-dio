package org.example.models.set.setofsinglewords;

import java.util.Objects;

public class SingleWords {

    private String word;

    public SingleWords(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleWords that)) return false;
        return Objects.equals(getWord(), that.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord());
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "SingleWords{" +
                "word='" + word + '\'' +
                '}';
    }
}
