package exercise04.ex07;

public class MyWorkMode extends WorkMode {
	private String state;
	
	@Override
	public void service(String state) {
		this.state = state;
		if(state.equals("낮") || state.equals("오후")) {
			day();
		}else {
			night();
		}
	}
	
	@Override
	public void day() {
		if ( "오후".equals(state)) {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	} else {
		System.out.println("낮에는 열심히 일하자!");
	}
	
}
}
