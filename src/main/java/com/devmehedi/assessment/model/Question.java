package com.devmehedi.assessment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "question")
@Entity(name = "Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(updatable = false, nullable = false, name = "question_identifier")
    private String questionIdentifier;
    @Column( length = 5000)
    @NotBlank(message = "Question content is required!")
    private String content;
    private String image;
    @Column(name = "option_1")
    @NotBlank(message = "Question option4 is required!")
    private String option1;
    @Column(name = "option_2")
    @NotBlank(message = "Question option4 is required!")
    private String option2;
    @Column(name = "option_3")
    @NotBlank(message = "Question option4 is required!")
    private String option3;
    @Column(name = "option_4")
    @NotBlank(message = "Question option4 is required!")
    private String option4;
    @Column(name = "option_5")
    private String option5;
    @NotBlank(message = "Question answer is required!")
    private String answer;
    @Transient
    @Column(name = "given_answer")
    private String givenAnswer;
}
