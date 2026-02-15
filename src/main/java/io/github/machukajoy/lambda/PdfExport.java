package io.github.machukajoy.lambda;

public class PdfExport implements Export {
    @Override
    public void export(String content) {
        System.out.println("Exporting to PDF" + content);
    }
}
