package com.personal.university.progressmanagement.domain.aclass;

import com.personal.university.progressmanagement.domain.evaluation.Evaluation;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;

@Data
public class Class {
    private String register;
    private DayOfWeek dayOfWeek;
    private List<Evaluation> evaluationList;
    private ClassStatus classStatus;
}
