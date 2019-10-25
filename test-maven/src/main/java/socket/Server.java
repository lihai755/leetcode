package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/**
	 * ServerSocket���ڷ���ˣ�����ͨ��accept�����������󣬼���������󷵻�Socket��
	 * Socket���ھ���������ݴ��䣬�ͻ���ֱ��ʹ��Socket�������󲢴������ݡ�
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//����һ��ServerSocket����8080�˿�
			ServerSocket server = new ServerSocket(8080);
			//�ȴ�����
			Socket socket = server.accept();
			//���յ������ʹ��socket����ͨ�ţ�����BufferedReader���ڶ�ȡ����
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = is.readLine();
			System.out.println("received from client��"+line);
			//����PrintWriter�����ڷ�������
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("received data��"+line);
			pw.flush();
			pw.close();
			is.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
