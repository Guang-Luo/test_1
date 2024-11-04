package org.example.onlinebookstore.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class Result {

    private Integer code;
    private String result;
    private Object msg;


    public static Result success() {
        return new Result(1, "success", null);
    }

    public static Result success(Object data) {return new Result(1, "success", data);}

    public static Result error(String msg) {return new Result(0, "error", msg);}
}
