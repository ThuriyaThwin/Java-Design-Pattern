package dzp.ch3;

import org.junit.Test;

import com.jdc.dzp.ch3.Computer;
import com.jdc.dzp.ch3.factory.ComputerFactory;
import com.jdc.dzp.ch3.factory.PcFactory;
import com.jdc.dzp.ch3.factory.ServerFactory;

public class ComputerFactoryTest {

	@Test
	public void test() {
		Computer server = ComputerFactory.getComputer(new ServerFactory(
				"Xenon", "24GB", "4TB"));
		Computer pc = ComputerFactory.getComputer(new PcFactory(
				"Core i7", "8GB", "1TB"));
		
		System.out.println(server);
		System.out.println(pc);
	}

}
