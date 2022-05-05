all: test

test: test2
	MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	echo "MarkdownParseTest.class created"
	
test2:
	MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	echo "MarkdownParse.class created"

run: MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
	echo "JUnit Tests Ran"
