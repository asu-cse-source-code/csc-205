/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3activity2;

/**
 *
 * @author austinspencer
 */
public abstract class Publication 
{
    String title;
    public Publication()
    {
        title = "Unknown";
    }
    public abstract String getPulicationType();
    
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String toString()
    {
        return getPulicationType() + getTitle();
    }
}
