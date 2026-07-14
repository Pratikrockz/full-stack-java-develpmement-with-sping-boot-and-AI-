package QuizGame;

public class Question {
    private int Id;
    private String question;
    private String options1;
    private String options2;
    private String options3;
    private String options4;
    private String answer;

    

    public Question(int id, String question, String options1, String options2, String options3, String options4,
            String answer) {
        Id = id;
        this.question = question;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.options4 = options4;
        this.answer = answer;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOptions1() {
        return options1;
    }
    @Override
    public String toString() {
        return "Question [Id=" + Id + ", question=" + question + ", options1=" + options1 + ", options2=" + options2
                + ", options3=" + options3 + ", options4=" + options4 + ", answer=" + answer + "]";
    }
    public void setOptions1(String options1) {
        this.options1 = options1;
    }
    public String getOptions2() {
        return options2;
    }
    public void setOptions2(String options2) {
        this.options2 = options2;
    }
    public String getOptions3() {
        return options3;
    }
    public void setOptions3(String options3) {
        this.options3 = options3;
    }
    public String getOptions4() {
        return options4;
    }
    public void setOptions4(String options4) {
        this.options4 = options4;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
 
    
    

    

}
