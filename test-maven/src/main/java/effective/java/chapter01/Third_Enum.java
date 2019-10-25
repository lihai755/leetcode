package effective.java.chapter01;

/**
 * P15：实现Singleton还有第三种方法，只需编写一个包含单个元素的枚举类型
 * @author camus
 *
 */
public enum Third_Enum {
	INSTANCE;//默认枚举实例的创建是线程安全的，但是在枚举中的其他任何方法由自己负责。
}
