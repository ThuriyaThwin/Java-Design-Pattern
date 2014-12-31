package dzp.ch2;

import org.junit.Test;

import com.jdc.dzp.ch2.Computer;
import com.jdc.dzp.ch2.Computer.TYPE;
import com.jdc.dzp.ch2.ComputerFactory;

public class ComputerFactoryTest {

	@Test
	public void test() {
		Computer pc = ComputerFactory.getComputer(TYPE.PC, "4Gb", "500GB", "Core i3");
		Computer server = ComputerFactory.getComputer(TYPE.SERVER, "4Gb", "500GB", "Core i3");
		
		System.out.println("PC :: " + pc.toString());
		System.out.println("SV :: " + server.toString());
	}

}
