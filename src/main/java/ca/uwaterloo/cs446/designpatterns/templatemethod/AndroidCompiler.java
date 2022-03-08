package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class AndroidCompiler extends CrossCompiler {

	@Override
	protected void scanSources() {
		System.out.println("Scanning sources for Android");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Compiling sources for Android");
	}
}
