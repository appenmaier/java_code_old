package tests;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demos.tablelamp.v10.AlreadyPluggedInException;
import demos.tablelamp.v10.PlugType;
import demos.tablelamp.v10.TableLamp;
import demos.tablelamp.v10.TableLampStore;

/**
 * Testklasse fuer TableLampStore
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLampStoreTest {

	private static TableLampStore tableLampStore;

	@BeforeAll
	static void setUpAll() {
		ArrayList<TableLamp> tableLamps = new ArrayList<>();
		tableLamps.add(new TableLamp(PlugType.TYPE_F));
		tableLamps.add(new TableLamp(PlugType.TYPE_B));
		tableLamps.add(new TableLamp(PlugType.TYPE_I));

		tableLampStore = new TableLampStore("Super Tischleuchtenladen 2000", tableLamps);
	}

	@BeforeEach
	void setUpEach() {
		for (TableLamp t : tableLampStore.tableLamps()) {
			t.pullThePlug();
			t.switchOff();
		}
	}

	@Test
	void testPlugInAndSwitchOnAllTableLamps1() throws AlreadyPluggedInException {
		tableLampStore.plugInAndSwitchOnAllTableLamps();

		for (TableLamp t : tableLampStore.tableLamps()) {
			assertTrue(t.isShining());
		}
	}

	@Test
	void testPlugInAndSwitchOnAllTableLamps2() {
		assertThrows(AlreadyPluggedInException.class, () -> {
			tableLampStore.plugInAndSwitchOnAllTableLamps();
			tableLampStore.plugInAndSwitchOnAllTableLamps();
		});
	}

}
