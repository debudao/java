import java.io.*;
import java.util.*;
public class Test2
{
      public static void main(String[] args)
     {
           Scanner reader=new Scanner(System.in);

           System.out.println("������Ҫ������ļ�����");
	   String sourceName = reader.nextLine();
           
           System.out.println("\n������������ǣ�");
           System.out.printf("1.����%s���е����������ơ���Ϊ����ɽ����\n",sourceName);
           System.out.printf("2.�ڡ�%s����ԭ����Ϣ֮��������ѧ����Ϣ��\n",sourceName);
           
           try{
                 RandomAccessFile raf=new RandomAccessFile(sourceName,"rw");
                 long oldu=0;
                 raf.seek(oldu);
                 String s=raf.readLine();
                 while(s!=null)
                {
                   byte[] b=s.getBytes("ISO-8859-1");
                   s=new String(b);
                   long newu=raf.getFilePointer();
                   if(s.charAt(0)=='��'&&s.charAt(1)=='��'&&s.charAt(2)==' ')
                   {
                        raf.seek(oldu);
                        raf.write("��ɽ".getBytes());
                        break;
                   }      
                   oldu=newu;
                   s=raf.readLine();
                }

               System.out.printf("\n�ļ���%s���е����������ơ��Ѿ���Ϊ����ɽ��������ģ�\n",sourceName);
               System.out.printf("\n��������ļ���%s��������µ�ѧ����Ϣ����finish������\n\n",sourceName); 
               
               raf.seek(0);
               long w=raf.length();
               raf.seek(w);
               
               s=reader.nextLine();
               while(!s.equals("finish"))
               {
                   raf.write(s.getBytes());
                   raf.write("\n".getBytes());
                   s=reader.nextLine();
               }
               
	       
              }catch(IOException ioe){
			System.out.println("�����������");
              }
      }
}