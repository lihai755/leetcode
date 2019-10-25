package socket;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

public class HttpServer {
	public static void main(String[] args) throws Exception{
        //����ServerSocketChannel������8080�˿�
        ServerSocketChannel ssc=ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(8080));
        //����Ϊ������ģʽ
        ssc.configureBlocking(false);
        //Ϊsscע��ѡ����
        Selector selector=Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        //����������
        while(true){
            // �ȴ�����ÿ�εȴ�����3s������3s���̼߳����������У��������0���߲���������һֱ����
            if(selector.select(3000)==0){
                continue;
            }
            // ��ȡ�������SelectionKey
            Iterator<SelectionKey> keyIter=selector.selectedKeys().iterator();
            while(keyIter.hasNext()){
                SelectionKey key=keyIter.next();
                // �������̴߳���SelectionKey
                new Thread(new HttpHandler(key)).run();
                // ������󣬴Ӵ������SelectionKey���������Ƴ���ǰ��ʹ�õ�key
                keyIter.remove();
            }
        }
    }
}
	
