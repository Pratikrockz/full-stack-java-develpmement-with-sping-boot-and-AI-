package QuizGame;

import java.util.Scanner;

public class QuestionService {
    Question[] question = new Question[3];

    String selection[] = new String[3];

    public QuestionService() {
        question[0] = new Question(0, "what", "Java", "python", "c++", "ruby", "Java");

        question[1] = new Question(1, "Fav", "Java", "python", "c++", "ruby", "Java");

        question[2] = new Question(2, "curr", "Java", "python", "c++", "ruby", "Java");
    }

    public void QuizGame() {
        int i = 0;
        for (Question q : question) {
            System.out.println("no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOptions1());
            System.out.println(q.getOptions2());
            System.out.println(q.getOptions3());
            System.out.println(q.getOptions4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();

            i++;

        }


        for(String s :selection){
            System.out.println(s);
        }
    }


public void CalculateScore(){
    int score=0;
    for(int i =0;i<question.length;i++){
        Question que = question[i];
        String ActualAns=que.getAnswer();
        String userAns= selection[i];
        System.out.println("This is actual answer"+ActualAns);

        System.out.println("This is user answer"+userAns);

        if(ActualAns.equals(userAns)){
            System.out.println("within loop");
            score++;
        }
    }
    System.out.println("your score: "+score);
}



}
