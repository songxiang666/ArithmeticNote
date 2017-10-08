package com.song.Section1.part3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
	public static void main(String[] args){
		Stack<String> ops=new Stack<String>();
		Stack<Double> vals=new Stack<Double>();
		while(!StdIn.isEmpty()){
			String s=StdIn.readString();
			if     (s.equals("("))      ;//如果遇到做括弧  不作处理
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) ops.push(s);
			else if(s.equals(")")){
				//如果遇到右括号  弹出运算符和操作数，计算结果并压入栈
				String op=ops.pop();
				double v=vals.pop();
				if     (op.equals("+"))  v=vals.pop()+v;
				else if(op.equals("-"))  v=vals.pop()-v;
				else if(op.equals("*"))  v=vals.pop()*v;
				else if(op.equals("/"))  v=vals.pop()/v;
				else if(op.equals("sqrt"))  v=Math.sqrt(v);
				vals.push(v);//计算结果压栈
			}
			else vals.push(Double.parseDouble(s));
		}
		StdOut.println(vals.pop());
	}

}
