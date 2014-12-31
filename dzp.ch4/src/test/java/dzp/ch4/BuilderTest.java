package dzp.ch4;

import org.junit.Test;

import com.jdc.dzp.ch4.Computer;

public class BuilderTest {

	@Test
	public void test() {
		Computer computer = new Computer.ComputerBuilder("8GB", "500GB")
				.setBlueToothEnabled(true).setGraphicEnabled(false).build();
		System.out.println(computer);
	}

}
