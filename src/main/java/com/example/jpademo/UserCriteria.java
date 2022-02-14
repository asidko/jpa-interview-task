package com.example.jpademo;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Set;

public class UserCriteria {
    @Parameter(description = "Filter users by concrete ids")
    private Set<Long> ids;
    @Parameter(description = "Filter by shift dates are after given date", example = "2022-01-07T00:00:00")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime hasShiftAfter;

    public UserCriteria() {
    }

    public Set<Long> getIds() {
        return ids;
    }

    public void setIds(Set<Long> ids) {
        this.ids = ids;
    }

    public LocalDateTime getHasShiftAfter() {
        return hasShiftAfter;
    }

    public void setHasShiftAfter(LocalDateTime hasShiftAfter) {
        this.hasShiftAfter = hasShiftAfter;
    }
}
