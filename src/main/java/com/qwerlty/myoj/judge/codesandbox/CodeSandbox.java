package com.qwerlty.myoj.judge.codesandbox;

import com.qwerlty.myoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.qwerlty.myoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
