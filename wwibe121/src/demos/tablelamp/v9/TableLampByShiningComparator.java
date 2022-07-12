package demos.tablelamp.v9;

import java.util.Comparator;

public class TableLampByShiningComparator implements Comparator<TableLamp> {

	@Override
	public int compare(TableLamp o1, TableLamp o2) {
		if (o1.isShining == true && o2.isShining == false) {
			return 1;
		} else if (o1.isShining == false && o2.isShining == true) {
			return -1;
		} else {
			return 0;
		}
	}

}
