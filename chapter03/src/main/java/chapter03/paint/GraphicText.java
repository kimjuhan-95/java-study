package chapter03.paint;

import com.bit2025.paint.text.Drawble;

public class GraphicText implements Drawble {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}
	
	@Override
	public void draw() {
		System.out.println("텍스트 '" + text + "' 를 그렸습니다");
	}

}