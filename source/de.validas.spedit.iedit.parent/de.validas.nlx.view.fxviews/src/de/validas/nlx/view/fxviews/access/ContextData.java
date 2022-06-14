package de.validas.nlx.view.fxviews.access;

import org.eclipse.emf.common.util.EList;

public class ContextData {
	private int pos;
	private EList<String> separators;
	private String end;
	private String start;

	public ContextData() {
	}

	public ContextData(int pos, EList<String> separators, String start, String end) {
		this.pos = pos;
		this.separators = separators;
		this.start = start;
		this.end = end;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public EList<String> getSeparators() {
		return separators;
	}

	public void setSeparators(EList<String> separators) {
		this.separators = separators;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
}