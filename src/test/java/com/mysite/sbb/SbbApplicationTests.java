package com.mysite.sbb;

import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 50; i++) {
			String subject = String.format("Test Date Sample:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content, null);
		}
	}
}