package com.personal.university.progressmanagement.domain.evaluation;

import com.personal.university.progressmanagement.domain.level.Level;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Evaluation {
    private Date date;
    private BigDecimal grade;
    private Level level;
}
