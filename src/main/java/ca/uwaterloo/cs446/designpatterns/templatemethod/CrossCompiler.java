package ca.uwaterloo.cs446.designpatterns.templatemethod;

public abstract class CrossCompiler {
	public void crossCompile() {
		scanSources();
		compileToTarget();
	}
	
	protected abstract void scanSources();
	protected abstract void compileToTarget();
}
