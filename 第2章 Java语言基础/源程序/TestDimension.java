public class TestDimension{
	public static void main(String[] args){
		//�����������ͳ�ʼ����һά���鹹�ɵ����飺
		int[][] n = new int[2][];
		n[0] = new int[3]; //��һ��һά���鳤��Ϊ3
		n[0][0] = 1; n[0][1] = 2; n[0][2] = 3;
		n[1] = new int[2]; //�ڶ���һά���鳤��Ϊ2
		n[1][0] = 11; n[1][1] = 12;
		//�����������ͳ�ʼ��һ��һά���飺
		int[] a = {101, 102, 103, 104};
		//��������ָ��
		n[0] = a;
		System.out.println("n[0][2]��ֵ��3����103��");
		System.out.println("n[0][2]��ֵ��" + n[0][2]);
	}
}