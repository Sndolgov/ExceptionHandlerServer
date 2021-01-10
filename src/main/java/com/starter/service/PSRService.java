package com.starter.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSRService implements PSR
{
    private final List<?> answers = List.of(true, false, new Papaya());
    private int position = 2;

    public boolean isPositive(){
        if (position == answers.size())
            position =0;
        System.out.println(position);
        Boolean answer = (Boolean) answers.get(position++);
        System.out.println(answer);
        return answer;
    }

    private class Papaya
    {
    }
}
