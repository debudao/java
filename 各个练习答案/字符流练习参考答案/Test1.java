import java.io.*;
import java.util.*;
public class Test1
{
      public static void main(String[] args)
     {
           Scanner reader=new Scanner(System.in);

           System.out.println("�������һ���ļ���·�����ļ�����");
	   String sourceName = reader.nextLine();

           System.out.println("������ڶ����ļ���·�����ļ�����");
	   String destName = reader.nextLine();
           
           try{
                FileWriter fw = new FileWriter(sourceName);
                BufferedWriter bw = new BufferedWriter(fw);

                System.out.println("\n��һ���ļ����ѧ������������ѧ�ɼ��ͼ�����ɼ�������֮���ÿո������\n");
                System.out.println("�����һ���ļ��������ݣ���finish������");
                String s=reader.nextLine();
                while(!s.equals("finish"))
               {
                    bw.write(s);
                    bw.newLine();
                    s=reader.nextLine();
               }
               bw.flush();
               bw.close();
               fw.close();
               
               System.out.println("��һ���ļ����ա��š���ѧ������Ϣ�Ѿ���ŵ��ڶ����ļ����뵽����·�����ģ�");
               FileReader fr = new FileReader(sourceName);
	       BufferedReader br = new BufferedReader(fr);
               
               FileWriter fw2 = new FileWriter(destName);
               BufferedWriter bw2 = new BufferedWriter(fw2);

               while((s=br.readLine())!= null)
               {
                      if(s.charAt(0)=='��')
                      {
		          bw2.write(s);
		          bw2.newLine();
                      }
	       }
	       bw2.flush();
	       bw2.close();
	       fw2.close();
	       br.close();
	       fr.close();
              }catch(IOException ioe){
			System.out.println("�����������");
              }  
      }
}