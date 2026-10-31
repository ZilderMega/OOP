package enums;

public enum Dictionary {
    HI ("Hi", "Hello"),
    BYE ("Bye", "Good bye"),
    HOWAREYOU ("How are you", "How are your doing"),
    UNKNOW ("Unknow message", "Unknow message");

    private final String word;
    private final String answer;

    Dictionary (String word, String answer) {
        this.word = word;
        this.answer = answer;
    }

    public String getWord() {
        return this.word;
    }

    public String getAnswer() {
        return this.answer;
    }

    public static Dictionary getConstant(String word) {
        for (Dictionary element : Dictionary.values()) {
            if (word.equals(element.getWord())) {
                return element;
            }
        }
        return UNKNOW;
    }
}
