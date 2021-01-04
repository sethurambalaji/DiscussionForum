package discussion.forum.units.service;

import com.forum.units.Question;
import com.forum.units.User;
//trying to commit

public interface QuestionService {
	Question createQuestion(String title, String message, User user);
	
	Question getQuestionById(long id);
	
	void deleteQuestion(Question question);
}


//trying to add more comments