import java.util.*;
class Main
{
  public static void main(String[] args)
  {
  Scanner obj=new Scanner(System.in);
  String a=obj.next();
  char [] arr=a.toCharArray();
  LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
  for(int i=0;i<arr.length;i++)
  {
    if(map.containsKey(arr[i]))
    {
      map.put(arr[i],map.get(arr[i])+1);
    }
    else{
      map.put(arr[i],1);
    }
  }
  StringBuilder str=new StringBuilder();
  for(Map.Entry<Character,Integer> m :map.entrySet())
  {
    if(m.getValue()>1)
    {
      str.append(String.valueOf(m.getKey()));
    }
  }
  String fhalf=str.toString();
  String shalf=str.toString();
  System.out.println(fhalf + shalf);
}
}