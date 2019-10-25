package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	/**
	 * �������Զ���msg���͸�����ˣ�Ȼ���ٽ��ܷ���˷��صĶ����ݲ���ӡ������̨������ͷ���Դ�ر�����
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String msg = "Client data";
			//����һ��socket����������8080�˿�����
			Socket socket = new Socket("127.0.0.1",8080);
			//ʹ��Socket����PrintWriter��BufferedReader���ж�д����
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//��������
			pw.println(msg);
			pw.flush();
			//��������
			String line = is.readLine();
			System.out.println("reveived from server��"+line);
			//�ر���Դ
			pw.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
