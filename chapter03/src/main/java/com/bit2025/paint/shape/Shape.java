package com.bit2025.paint.shape;

import com.bit2025.paint.point.Point;
import com.bit2025.paint.text.Drawble;

public abstract class Shape implements Drawble {
	private Point[] points;
	private String fillColor;
	private String lineColor;
}