package com.chinni.basics.non_static_members;
class CurArgObj 
{
	int x=10;
	int y=20;
	void  m1(int p){
	p=50;
	}

	void m2(CurArgObj  e){
		e=new CurArgObj();
	}

	void m3(CurArgObj e){
		e.x=15;
	}

	void m4(CurArgObj e ){
		e=new CurArgObj();
	}

	void m5(CurArgObj e){
     	e.x=20;
        e=new CurArgObj();
		e.x=40;
	}
}
