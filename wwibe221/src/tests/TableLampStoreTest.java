package tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demos.tablelamp.v10.LightBulb;
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

	@BeforeEach
	void setUp() {
		ArrayList<TableLamp> tableLamps = new ArrayList<>();
		tableLamps.add(new TableLamp(PlugType.TYPE_F));
		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.RED)));
		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.BLUE)));

		tableLampStore = new TableLampStore("Super Lampenladen 2000", tableLamps);
	}

	@Test
	void testPlugInAndSwitchOnAllTableLamps() {
		tableLampStore.plugInAndSwitchOnAllTableLamps();

		for (TableLamp t : tableLampStore.tableLamps()) {
			assertTrue(t.isShining());
		}
	}

	@Test
	void getBrightestTableLamp() {
		tableLampStore.tableLamps().clear();

		assertNull(tableLampStore.getBrightestTableLamp());
	}

}
