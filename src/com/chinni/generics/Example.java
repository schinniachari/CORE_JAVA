package com.chinni.generics;

public class Example {
	static class Util {
		public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
			return p1.getKey().equals(p2.getKey())
					&& p1.getValue().equals(p2.getValue());
		}
	}// innerclass-1

	public static class Pair<M, N> {
		private M key;
		private N value;

		public Pair(M key, N value) {
			this.key = key;
			this.value = value;
		}

		public void setKey(M key) {
			this.key = key;
		}

		public void setValue(N value) {
			this.value = value;
		}

		public M getKey() {
			return key;
		}

		public N getValue() {
			return value;
		}
	}// innerclass222

	public static void main(String[] args) {
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		Pair<Integer, String> p1 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println(same);
	}
}
