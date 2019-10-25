package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	/**
	 * 启动后自动将msg发送给服务端，然后再接受服务端返回的而数据并打印到控制台，最后释放资源关闭连接
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String msg = "Client data";
			//创建一个socket，跟本机的8080端口连接
			Socket socket = new Socket("127.0.0.1",8080);
			//使用Socket创建PrintWriter和BufferedReader进行读写数据
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//发送数据
			pw.println(msg);
			pw.flush();
			//接收数据
			String line = is.readLine();
			System.out.println("reveived from server："+line);
			//关闭资源
			pw.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
