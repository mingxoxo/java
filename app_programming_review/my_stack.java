package kr.ac.sejong.ds;

public class MyStack {
	//데이터 추상화
	//크기가 고정
	String[] data = new String[0];
	//push 쌓는다
	//data에 item이 , [1, 2] -> [1, 2, 3]
	public void push(String item) {
		// 새 배열을 만든다.
		String[] newData = new String[data.length+1];
		//기존의 데이터 복사
		for(int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		//새로운 데이터를 넣는다.
		newData[data.length] = item;
		data = newData;
	}
	//pop 위에서 가져온다.
	//[1, 2, 3] -> [1, 2] 3을 반환한다.
	//n -> n-1개짜리 배열을 생성해서
	public String pop() {
		if(data.length == 0)
			return null;
		String[] newData = new String[data.length-1];
		for(int i = 0; i < newData.length; i++) {
			newData[i] = data[i];
		}
		String last = data[data.length - 1];
		data = newData;
		return last;
	}
}
