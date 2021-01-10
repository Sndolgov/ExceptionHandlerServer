package com.starter.service;

import com.starter.HandleException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSRService
{
    private final List<?> answers = List.of(true, false, new Papaya());
    private int position;

    @HandleException
    public boolean isPositive(){
        if (position == answers.size())
            position =0;
        System.out.println(position);
        Boolean answer = (Boolean) answers.get(position++);
        System.out.println(answer);
        return answer;
    }

    public boolean isPositive2(){
        return isPositive();
    }

    private class Papaya
    {
    }
}
