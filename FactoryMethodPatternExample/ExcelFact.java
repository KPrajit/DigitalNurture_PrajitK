public class ExcelFact extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new Excel();
    }
}
