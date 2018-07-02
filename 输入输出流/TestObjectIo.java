import java.io.*;
import java.util.*;
class Computer implements Serializable
{
	String name;
	double unitPrice;
	Computer(String name, double unitPrice)
       {
		this.name = name;
		this.unitPrice = unitPrice;
	}
}

public class TestObjectIo
{
	public static void main(String[] args)
        {
		try{
                        Scanner reader=new Scanner(System.in);
                        System.out.println("������·�����ļ�����");
                        String s=reader.nextLine();
                        
			FileOutputStream fos=new FileOutputStream(s);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
                 
                        System.out.println("���������������ƺ͵��ۣ��ûس���������finish������\n");
                        System.out.println("���������������ƺ͵��ۣ�\n");
                        String s1=reader.nextLine();
                        while(!s1.equals("finish"))
                       {
                           double unitPrice=reader.nextDouble();
			   Computer computer = new Computer(s1, unitPrice);
			   oos.writeObject(computer);
                           System.out.println("���������������ƺ͵��ۣ�\n");
                           s1=reader.nextLine();
                           s1=reader.nextLine();
		       }
                        oos.writeObject(null);
		        oos.close();
		        fos.close();

			FileInputStream fis=new FileInputStream(s);
			ObjectInputStream ois = new ObjectInputStream(fis);

			double everagePrice=0;
                        int count=0;
                        Computer computer2=(Computer)ois.readObject();
                        while(computer2!=null)
                       {
                             everagePrice=everagePrice+computer2.unitPrice;
                             count=count+1;
                             computer2=(Computer)ois.readObject();
                       }
                       everagePrice=everagePrice/count;
                       System.out.printf("\n�ļ�%s�еļ������ƽ���۸���%.2f��\n",s,everagePrice);
			
		}catch(IOException ioe){
			System.out.println(ioe);
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe);
		}
               
	}
}