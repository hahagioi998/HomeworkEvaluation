package com.buguagaoshu.homework.evaluation.vo;

import com.buguagaoshu.homework.common.valid.ListValue;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pu Zhiwei {@literal puzhiweipuzhiwei@foxmail.com}
 * create          2021-03-16 22:39
 * 想法
 */
@Data
public class ThinkVo {
    @NotNull(message = "正文不能为空！")
    private String content;

    @ListValue(value = {100})
    private Integer type;


    private List<String> files;

    private Long forward;
}
