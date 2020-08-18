package com.kjq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 12:12
 * @package com.kjq.springcloud.entities
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;

    private T  date;

    public CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}
