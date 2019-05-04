package com.threadhold;

import java.util.UUID;

public class AddRunable implements Runnable
{
    private Calculator calculator;
    private String myRandomId;

    public String getMyRandomId()
    {
        return myRandomId;
    }

    public void setMyRandomId(String myRandomId)
    {
        this.myRandomId = myRandomId;
    }

    public AddRunable(Calculator c)
    {
        this.calculator = c;
    }

    @Override
    public void run()
    {
        calculator.addNum(1000);
    }

    private String CreateRandomId()
    {
        myRandomId = UUID.randomUUID().toString();
        return myRandomId;
    }

}

