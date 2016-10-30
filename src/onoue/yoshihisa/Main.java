package onoue.yoshihisa;

import onoue.yoshihisa.util.SampleConfigurationFile;

public class Main {
	public static void main(String[] args) {
		SampleConfigurationFile conf = new SampleConfigurationFile();
		System.out.println("English character : " + conf.getString("key1"));
		System.out.println("Japanese character : " + conf.getString("key2"));
	}
}
