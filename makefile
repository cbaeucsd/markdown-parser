MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	echo "MarkdownParseTest.class created"
	
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	echo "MarkdownParse.class created"

run: MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
	echo "JUnit Tests Ran"
