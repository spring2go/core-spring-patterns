package io.spring2go.corespring.stack;

// 基于数组的栈实现
public class ArrayStack<T> implements IStack<T> {

	private static final int DEFAULT_CAPACITY = 15;
	private int top; // 指向栈顶元素
	private T[] array;

	// region 构造函数
	/**
	 * 创建一个栈，指定初始容量
	 */
	public ArrayStack(int initialCapacity) {
		if (initialCapacity <= 0)
			array = (T[]) new Object[DEFAULT_CAPACITY];
		else
			array = (T[]) new Object[initialCapacity];

		top = -1; // 栈空
	}

	/**
	 * 创建一个栈，使用初始容量
	 */
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	// endregion

	/**
	 * 检查栈是否为空
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * 移除并返回栈顶元素
	 */
	public T pop() throws StackException {
		T x = peek();
		array[top] = null; // 确保对象被回收
		top--;
		return x;
	}

	/**
	 * 返回栈顶元素，但是不移除
	 */
	public T peek() throws StackException {
		if (isEmpty())
			throw new StackException("Stack is empty");
		return array[top];
	}

	/**
	 * 在栈顶添加一个新元素
	 */
	public void push(T e) throws StackException {
		if (top == array.length)
			throw new StackException("Stack has overflowed");
		top++;
		array[top] = e;
	}

	/**
	 * 清空栈元素
	 */
	public void clear() {
		for (int i = 0; i <= top; i++) {
			array[i] = null;
		}
		top = -1;
	}

	/**
	 * 返回栈的字符串表示
	 */
	public String toString() {
		if (isEmpty())
			return "[ ]";

		StringBuffer out = new StringBuffer("[");
		for (int i = 0; i < top; i++)
			out.append(array[i] + ", ");

		out.append(array[top] + "]");
		return out.toString();
	}

}
