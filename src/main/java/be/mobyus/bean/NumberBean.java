package be.mobyus.bean;

import java.io.Serializable;
import java.util.List;

public class NumberBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Integer> numbers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Integer> luckyNumbers) {
		this.numbers = luckyNumbers;
	}

}
