package com.chinni.oops.encapsulation;

	public class ImmutableClass {
	
		private final int value;
		private final String name;
		private final StringBuilder name1;
		private final String testSB;
	
		// changed the constructor, to say Immutable, instead of mutable
		private ImmutableClass( int aValue,  String aName,  StringBuilder aName1,StringBuilder aTestSB) {
			// The value is set. Now, and forever.
			value = aValue;
			name1=aName1;
			name=aName;
			testSB=new String(aTestSB);
		}
	
		public static ImmutableClass getInstance(int aValue,  String aName,  StringBuilder aName1,StringBuilder aTestSB) {
			 return new ImmutableClass(aValue,aName,aName1,aTestSB);
		}
		public StringBuilder getTestSB() {
			return new StringBuilder(testSB);
		}
	
		public String getName() {
			return name;
		}
	
		public StringBuilder getName1() {
			return name1;
		}
	
		public final int getValue() {
			return value;
		}
	
	}