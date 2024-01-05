package com.personal.universityprogressmanagement.models;

import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;

@Data
public class Class {
    private String register;
    private DayOfWeek dayOfWeek;
    private List<Evaluation> evaluationList;
}
