public class WordFact extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new Word();
    }
}
