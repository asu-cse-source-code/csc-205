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
public class PublicationDemo 
{
    public static void main(String[] args)
    {
        Magazine mag = new Magazine();
        Book bk = new Book();
        mag.setTitle(" Times");
        bk.setTitle(" Dictionary");
        System.out.println(mag.toString());
        System.out.println(bk.toString());
    }
}
