package resourcesFile;

public class TestPropertyFromResourceNonStaticWay {

	public static void main(String[] args) {
		PropertyFromResourceFolderNonStaticWay prop = new PropertyFromResourceFolderNonStaticWay();
		System.out.println(prop.readConfigFileFromResource());
	}
}
