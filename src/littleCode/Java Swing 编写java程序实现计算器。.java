//package cn.itcast.day04.demo01;
////��дjava����ʵ�ּ�������
////ʵ�ּ򵥼�������ͬʱ�����⻹Ҫʵ�������������ܡ�
////@Override
//public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		String clickStr = e.getActionCommand();
//
//		if(".0123456789".indexOf(clickStr)!=-1)
//		{
//
//		/* ��һ��С�����ֹ�����ڲ������ĵ�һ��λ��     ���磺 .123 �Ƿ�����*/
//
//		/* �ڶ���00���ֹ�����ڲ������ĵ�һ���ڶ���λ�� ���磺 00123 �Ƿ�����*/
//
//		/* ��������������С����������ܳ���2��          ���磺3.1415.9 �Ƿ�����*/
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
//			//��ʾ���
//			this.input_text.setText("" + result);
//
//		}
//
//
//	}
