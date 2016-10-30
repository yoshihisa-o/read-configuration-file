package onoue.yoshihisa.util;

/**
 * A class to provide access to sample.conf
 * @author yoshihisaonoue
 *
 */
public class SampleConfigurationFile extends AbstractConfigurationFile {

	private static final String PATH = "conf/sample.conf";
	private static final String ENCODING = "EUC-JP";
	
	@Override
	protected String getPath() {
		return PATH;
	}

	@Override
	protected String getEncoding() {
		return ENCODING;
	}

}
