package com.qwerlty.myoj.judge.codesandbox;

import com.qwerlty.myoj.judge.codesandbox.CodeSandbox;
import com.qwerlty.myoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.qwerlty.myoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.qwerlty.myoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type){
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
