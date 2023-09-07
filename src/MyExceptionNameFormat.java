public class MyExceptionNameFormat extends Exception {
    private final int index;
    private final char ch;
    private final String name;

    public int getIndex() {
        return index;
    }

    public char getCh() {
        return ch;
    }

    public String getName() {
        return name;
    }

    public MyExceptionNameFormat(String message, String name, char ch, int index) {
        super(message);
        this.index = index;
        this.ch = ch;
        this.name = name;


    }
}
