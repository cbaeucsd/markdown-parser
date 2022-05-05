all: test2

test:
MarkdownParse.class: MarkdownParse.java
javac MarkdownParse.java

test2: test
MarkdownParseTest.class: MarkdownParseTest.java
javac MarkdownParseTest.java

run: 
MarkdownParse.class
	java MarkdownParse test-file.md