package org.example.models.set.setofsinglewords;

import java.util.HashSet;
import java.util.Set;

public class SetOfSingleWords   {

    private Set<SingleWords> singleWords;

    public SetOfSingleWords() {
        this.singleWords = new HashSet<>();
    }

    public void addWord(String word){
        singleWords.add(new SingleWords(word));
    }

    public void removeWord(String word){
        SingleWords wordForRemoving = null;
        for(SingleWords s: singleWords){
            if(s.getWord().equalsIgnoreCase(word)){
                wordForRemoving = s;
                break;
            }
        }
        System.out.println("Palavra removida: " + wordForRemoving);
        singleWords.remove(wordForRemoving);
    }

    public void verifyWord(String word){
        for(SingleWords s: singleWords){
            if(s.getWord().equalsIgnoreCase(word)){
                System.out.println("A palavra " + word + ", existe em nosso conjunto de palavras!");
            }
        }
    }

    public void showAllWords(){
        System.out.println(singleWords);
    }

    public static void main(String[] args) {
        SetOfSingleWords setOfSingleWords = new SetOfSingleWords();

        setOfSingleWords.addWord("ABC");
        setOfSingleWords.addWord("DEF");
        setOfSingleWords.addWord("GHI");
        setOfSingleWords.addWord("JKL");

        setOfSingleWords.removeWord("DEF");
        setOfSingleWords.verifyWord("GHI");
        setOfSingleWords.showAllWords();

    }
}
