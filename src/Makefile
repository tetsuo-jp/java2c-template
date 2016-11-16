# Cの文からJavaの文への変換のテスト
testTrans:
	javac java2c/Java2C.java java2c/Trans.java
	echo "a = 1;" | java java2c/Java2C

testCStm:
	javac test/TestCStm.java
	echo "b = 2;" | java test/TestCStm

testJavaStm:
	javac test/TestJavaStm.java
	echo "c = 3;" | java test/TestJavaStm

test_unit:
	make -f Makefile_C test
	make -f Makefile_javaBNF test

distclean:
	make -f Makefile_C distclean
	make -f Makefile_javaBNF distclean
	rm -f Test/*.class
	rm -f java2c/*.class
