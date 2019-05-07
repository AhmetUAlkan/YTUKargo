import java.util.ArrayList;

public class Feedback {

    private int feedbackNo;
    private String feedback;
    ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();

    int createFeedback(String feedback){

        feedbacks.add(new Feedback(feedback));
        feedbackNo++;
        return getFeedbackNo();

    }

    void deleteFeedback(int feedbackNo){

        feedbacks.set(feedbackNo, null);

    }

    public Feedback(){
        feedbackNo = 0;
    }

    public Feedback(String feedback){
        this.feedback = feedback;
    }


    public int getFeedbackNo() {
        return feedbackNo;
    }

    public void setFeedbackNo(int feedbackNo) {
        this.feedbackNo = feedbackNo;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
