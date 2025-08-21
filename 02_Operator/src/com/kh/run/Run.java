package com.kh.run;

import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalNagation; 
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;

public class Run {

	
	public static void main(String[] args) {
		
		C_Compound c = new C_Compound();
		c.method1();
		
		D_LogicalNagation d = new D_LogicalNagation();
		d.method1();
		
		E_Comparison e = new E_Comparison();
		e.method1();
		
		F_Logical f = new F_Logical();
		f.method1();
		f.method2();
		f.method3();
		
		G_Triple g = new G_Triple();
		g.method1();
		g.method2();
		g.mine1();
		
	}
	
}
