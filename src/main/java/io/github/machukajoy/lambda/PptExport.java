package io.github.machukajoy.lambda;

public class PptExport implements Export {

    @Override
    public void export(String content) {
        System.out.println("Exporting to Powerpoint" + content);
    }
}
