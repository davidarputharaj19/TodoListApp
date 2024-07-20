package com.davidarputharaj.todolistapp.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TodoRequest {

    private String title;
}
