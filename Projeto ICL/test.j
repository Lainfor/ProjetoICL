.class public Main
.super java/lang/Object

.method public <init>()V
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 10
	.limit stack 256
	getstatic java/lang/System/out Ljava/io/PrintStream;
	
	aconst_null
	astore 4
	sipush 2
	sipush 2
	iadd 

	return
.end method
