import java.util.*;
class Passengersage {
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(12);
        a.add(16);
        a.add(22);
        a.add(34);
        a.add(40);
        a.add(44);
        a.add(46);
        int count=0;
        int kids_age=0;
        int teen_age=0;
        int adult=0;
        int aged=0;
        int senior=0;
        for(int i=0;i<a.size();i++)
        {
            count++;
            if(a.get(i)>0 && a.get(i)<=10)
            {
                kids_age++;
            }
            else if(a.get(i)>10 && a.get(i)<=20)
            {
                teen_age++;
            }
            else if(a.get(i)>20 && a.get(i)<=30)
            {
                adult++;
            }
            else if(a.get(i)>30 && a.get(i)<=40)
            {
                aged++;
            }
            else
            {
                senior++;
            }
        }
        System.out.println("The total count of Passengers:"+count);
        System.out.println("Age_Group"+" "+"Count");
        System.out.println("[0-10]"+"    "+kids_age);
        System.out.println("[11-20]"+"   "+teen_age);
        System.out.println("[21-30]"+"   "+adult);
        System.out.println("[31-40]"+"   "+aged);
        System.out.println("[41-50]"+"   "+senior);
    }
}
