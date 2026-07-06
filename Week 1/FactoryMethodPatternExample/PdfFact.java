public class PdfFact extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new Pdf();
    }
}
