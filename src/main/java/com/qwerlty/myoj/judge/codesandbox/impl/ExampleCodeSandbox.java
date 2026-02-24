package com.qwerlty.myoj.judge.codesandbox.impl;

import com.qwerlty.myoj.judge.codesandbox.CodeSandbox;
import com.qwerlty.myoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.qwerlty.myoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.qwerlty.myoj.judge.codesandbox.model.JudgeInfo;
import com.qwerlty.myoj.model.enums.JudgeInfoMessageEnum;
import com.qwerlty.myoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
