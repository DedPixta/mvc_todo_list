package com.makos.mvctodolist.dto;

import com.makos.mvctodolist.domain.Status;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TaskDTO {

    private Integer id;
    private String description;
    private Status status;

}
