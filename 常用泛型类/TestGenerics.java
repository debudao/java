class Chorus<E,F>       
{
   void makeChorus(E person,F yueqi)
   {
     person.toString();
     yueqi.toString();
   }
}
class 歌手
{
   public String toString()
   {
      System.out.println("好一朵美丽的茉莉花");
      return "";
   }
}
class 乐器
{
   public String toString()
   {
      System.out.println("|3 35 6116|5 56 5-|");
      return "";
   }
}
class TestGenerics
{
   public static void main(String args[])
   {
       Chorus<歌手,乐器> model=new Chorus<歌手,乐器>();    //创建一个对象model
       歌手 pengliyuan=new 歌手();
       乐器 piano=new 乐器();
       model.makeChorus(pengliyuan,piano);
   }
}