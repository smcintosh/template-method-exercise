package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class BlackBerryCompiler extends CrossCompiler {

	@Override
	protected void scanSources() {
		System.out.println("Scanning sources for BlackBerry");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Compiling sources for BlackBerry");
	}
}
