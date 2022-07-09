//package cn.itcast.day04.demo01;
////编写java程序实现计算器。
////实现简单计算器的同时，此外还要实现以下三个功能。
////@Override
//public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		String clickStr = e.getActionCommand();
//
//		if(".0123456789".indexOf(clickStr)!=-1)
//		{
//
//		/* 第一、小数点禁止出现在操作数的第一个位置     例如： .123 非法输入*/
//
//		/* 第二、00点禁止出现在操作数的第一、第二个位置 例如： 00123 非法输入*/
//
//		/* 第三、操作数中小数点个数不能超过2个          例如：3.1415.9 非法输入*/
//
//		}else if( clickStr.matches("[\\+\\-*/]{1}") ) {
//
//			operator = clickStr;
//			firstInput = this.input_text.getText();
//			this.input_text.setText("");
//
//		}else if(clickStr.equals("=")) {
//			String secondInput = this.input_text.getText();
//
//			double result = 0.0;
//			double firstNumber = Double.parseDouble(firstInput);
//
//			double secondNumber = Double.parseDouble(secondInput);
//
//			switch (operator) {
//			case "+":
//				result = firstNumber + secondNumber;
//				break;
//			case "-":
//				result = firstNumber - secondNumber;
//				break;
//			case "*":
//				result = firstNumber * secondNumber;
//				break;
//			case "/":
//				if(secondNumber!=0)
//				result = firstNumber * secondNumber;
//				break;
//
//			}
//			//显示结果
//			this.input_text.setText("" + result);
//
//		}
//
//
//	}
