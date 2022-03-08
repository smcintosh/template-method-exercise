package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		CrossCompiler compiler = new AndroidCompiler();
		compiler.crossCompile();
		
		compiler = new BlackBerryCompiler();
		compiler.crossCompile();
	}
}
