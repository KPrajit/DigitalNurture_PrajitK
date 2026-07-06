public class TestFact {
    public static void main(String[] args){
        DocumentFactory doc = new PdfFact();
        Document doc1 = doc.createDocument();
        doc1.open();
        DocumentFactory ExcObj = new ExcelFact();
        Document docc = ExcObj.createDocument();
        docc.open();
        DocumentFactory WordObj = new WordFact();
        Document docck = WordObj.createDocument();
        docck.open();
    }
    
}
