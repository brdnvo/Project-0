//Brandon Vo
//CS 1400
//Assignment 4
//10/30/21
public class Question
{
    private String q;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private int ans;

    public Question(String q, String ans1, String ans2, String ans3, String ans4, int ans)
    {
        this.q = q;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.ans = ans;
    }

    public void setTriviaQuestion(String questions)
    {
        q = questions;
    }
    public String getTriviaQuestion()
    {
        return q;
    }

    public void setAnswer1(String answer1)
    {
        ans1 = answer1;
    }
    public String getAnswer1()
    {
        return ans1;
    }

    public void setAnswer2(String answer2)
    {
        ans2 = answer2;
    }
    public String getAnswer2()
    {
        return ans2;
    }

    public void setAnswer3(String answer3)
    {
        ans3 = answer3;
    }
    public String getAnswer3()
    {
        return ans3;
    }

    public void setAnswer4(String answer4)
    {
        ans4 = answer4;
    }
    public String getAnswer4()
    {
        return ans4;
    }

    public void setCorrectAnswer(int correctans)
    {
        ans = correctans;
    }

    public int getCorrectAnswer()
    {
        return ans;
    }
}