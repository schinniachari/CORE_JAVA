package com.chinni.multi_threading.practice;

class TimeDiffNor {
	public static void main(String[] args) {
		PrintNum p = new PrintNum();
		long time1 = System.currentTimeMillis();
		p.print1to20();
		p.print20to1();
		long time2 = System.currentTimeMillis();
		System.out.println("");
		System.out.println("time taken:" + (time2 - time1) / 1000 + " secs");
	}
}