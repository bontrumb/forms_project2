abstract class SString extends Struct
{
	protected String heap;
	public SString(String Type, String Units) {
		super(Type, Units);
	}
	public SString(String o, String Type, String Units) {
		super(o, Type, Units);
	}
	protected boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	protected boolean CC(Object o) {
		return true;
	}
	protected boolean CT(Object o) {
		try {
			this.heap = (String) o;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
