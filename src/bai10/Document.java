package bai10;

public class Document {
    private String str;

    public Document(String str) {
        this.str = str;
    }

    public Document() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void chuanHoa() {
        while (str.indexOf("  ") >= 0) {
           str = str.replaceAll("  ", " ");
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "str='" + str + '\'' +
                '}';
    }
}
