package com.kg.apis;


public class YesOrNo
{
    private String image;

    private String answer;

    private String forced;

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getAnswer ()
    {
        return answer;
    }

    public void setAnswer (String answer)
    {
        this.answer = answer;
    }

    public String getForced ()
    {
        return forced;
    }

    public void setForced (String forced)
    {
        this.forced = forced;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image = "+image+", answer = "+answer+", forced = "+forced+"]";
    }
}

