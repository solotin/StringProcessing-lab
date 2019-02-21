package com.solotin;

import java.util.Arrays;
import java.util.HashMap;

interface IStringProcessing
{
    void translit();
}
public class StringProcessing implements IStringProcessing {
    private static HashMap<Character,String> dist;
    private String str;
    static {
        dist = new HashMap<Character, String>(32);
        dist.put('а',"a");
        dist.put('б',"b");
        dist.put('в',"v");
        dist.put('г',"g");
        dist.put('д',"d");
        dist.put('е',"ye");
        dist.put('ё',"ye");
        dist.put('ж',"j");
        dist.put('з',"z");
        dist.put('и',"i");
        dist.put('й',"yi");
        dist.put('к',"k");
        dist.put('л',"l");
        dist.put('м',"m");
        dist.put('н',"n");
        dist.put('о',"o");
        dist.put('п',"p");
        dist.put('р',"r");
        dist.put('с',"s");
        dist.put('т',"t");
        dist.put('у',"u");
        dist.put('ф',"f");
        dist.put('х',"h");
        dist.put('ц',"c");
        dist.put('ч',"ch");
        dist.put('ш',"sch");
        dist.put('щ',"sch");
        dist.put('ь',"");
        dist.put('ы',"i");
        dist.put('ъ',"");
        dist.put('э',"e");
        dist.put('ю',"yu");
        dist.put('я',"ya");

    }
    public  StringProcessing()
    {
        this("абвгдеёжзийклмнопрстуфхцчшщьыъэюя");
    }
    public StringProcessing(char[] charArr)
    {
        this.str= new String(charArr);
    }
    public StringProcessing(String str)
    {
       this.str=str;
    }
    public void translit()
    {
        StringBuffer sb = new StringBuffer(str.length());
        char[] charArr=str.toCharArray();
        for(char ch:charArr)
        {
            String transl_ch=dist.get(ch);
            if(transl_ch!=null) sb.append(transl_ch);
            else
            {
                transl_ch = dist.get(Character.toLowerCase(ch));
                if(transl_ch!=null) sb.append(transl_ch.toUpperCase());
                else sb.append(ch);
            }
        }
        str=sb.toString();
    }
    public String toString()
    {
        return str.toString();
    }
    public String toString(int start,int end)
    {
        String st=null;
        try
        {
            st = str.substring(start, end);
        }
        catch (StringIndexOutOfBoundsException ex)
        {
        }
        finally
        {
            return st;
        }
    }
}
