package com.nellyville.caloriecounter;

public class Glizzy
{
    public static final int STANDARD_GLIZZY_CAL = 291;
    public static final int SUMMER_SAUSAGE_CAL = 261;
    public static final int BEYOND_GLIZZY_CAL = 204;
    public static final int RELISH_CAL = 20;
    public static final int KETCHUP_CAL = 19;
    public static final int MUSTARD_CAL = 3;
    public int meatChoice;
    boolean ketchup = false;
    boolean relish = false;
    boolean mustard = false;
    public int finalCalCount;

    public void setKetchup(boolean ketchup)
    {
        this.ketchup = ketchup;
    }
    public int getKetchupCal()
    {
        if(ketchup == true)
        {
            return KETCHUP_CAL;
        }
        else
        {
            return 0;
        }
    }

    public void setRelish(boolean relish)
    {
        this.relish = relish;
    }
    public int getRelishCal()
    {
        if(relish == true)
        {
            return RELISH_CAL;
        }
        else
        {
            return 0;
        }
    }

    public void setMustard(boolean mustard)
    {
        this.mustard = mustard;
    }
    public int getMustardCal()
    {
        if(mustard == true)
        {
            return MUSTARD_CAL;
        }
        else
        {
            return 0;
        }
    }

    public void getGlizzyCal(int fcc)
    {
        finalCalCount = fcc;
    }

    public int meatCalGetter()
    {
        if(meatChoice == 1)
        {
            return STANDARD_GLIZZY_CAL;
        }
        else if(meatChoice == 2)
        {
            return SUMMER_SAUSAGE_CAL;
        }
        else if(meatChoice == 3)
        {
            return BEYOND_GLIZZY_CAL;
        }
        else
        {
            return 0;
        }
    }
    public void meatNum(int i)
    {
        meatChoice = i;
    }

    public int totalGlizzyCal()
    {
        return getKetchupCal() + getRelishCal() + getMustardCal() + finalCalCount + meatCalGetter();
    }
}