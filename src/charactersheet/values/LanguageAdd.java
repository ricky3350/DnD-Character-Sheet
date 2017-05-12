package charactersheet.values;

public class LanguageAdd implements Addition {

	private final Language language;

	public LanguageAdd(final Language language) {
		this.language = language;
	}

	@Override
	public Object getProperty() {
		return "Languages";
	}

	@Override
	public Object getChange() {
		return language;
	}

}
