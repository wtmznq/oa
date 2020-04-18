package org.java.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> {
    private List<T> data;
    private String msg;
    private int code=0;
    private Long count;
}
