# Required export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"

SOURCE=miniJava
PROG=prog

all:
	java -jar /usr/local/lib/antlr-4.5.3-complete.jar $(SOURCE).g4
	javac $(SOURCE)*.java

run: all
	java org.antlr.v4.gui.TestRig $(SOURCE) $(PROG) -gui factorial.java

clean:
	rm -f *.class

cleanall: clean
	rm -f $(SOURCE)*.java *.tokens

.PHONY: compiler run all clean
