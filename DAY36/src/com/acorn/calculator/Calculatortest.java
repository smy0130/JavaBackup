package com.acorn.calculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatortest {

	private JFrame f;
	private JPanel controlPanel;
	
	private JTextField tfResult;
	
	private JButton btnNum00;
	private JButton btnNum01;
	private JButton btnNum02;
	private JButton btnNum03;
	private JButton btnNum04;
	private JButton btnNum05;
	private JButton btnNum06;
	private JButton btnNum07;
	private JButton btnNum08;
	private JButton btnNum09;
	
	private JButton btnOperatoradd;
	private JButton btnOperatorsub;
	private JButton btnOperatormul;
	private JButton btnOperatordiv;
	
	private JButton btnClear;
	private JButton btnCommandRun;
	
	private StringBuilder currentInput = new StringBuilder(); //문자열로 입력을 저장
	
	public Calculatortest() {
		f = new JFrame("계산기");
		f.setSize(300,380);
		f.setLayout(null);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBackground(Color.WHITE);
		tfResult.setBounds(8, 10, 270, 40);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(4, 4, 10, 10));
		controlPanel.setBounds(8, 70, 270, 250);
		
		btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		btnOperatordiv = new JButton("/");
		btnOperatordiv.setBackground(Color.GRAY);
		btnOperatordiv.setForeground(Color.WHITE);
		btnOperatormul = new JButton("x");
		btnOperatormul.setBackground(Color.GRAY);
		btnOperatormul.setForeground(Color.WHITE);
		btnCommandRun = new JButton("=");
		btnCommandRun.setBackground(Color.GRAY);
		btnCommandRun.setForeground(Color.WHITE);
		
		btnNum07 = new JButton("7");
		btnNum07.setBackground(Color.BLACK);
		btnNum07.setForeground(Color.WHITE);
		btnNum07 = createNumberButton("7");
		btnNum08 = new JButton("8");
		btnNum08.setBackground(Color.BLACK);
		btnNum08.setForeground(Color.WHITE);
		btnNum08 = createNumberButton("8");
		btnNum09 = new JButton("9");
		btnNum09.setBackground(Color.BLACK);
		btnNum09.setForeground(Color.WHITE);
		btnNum09 = createNumberButton("9");
		btnOperatoradd = new JButton("+");
		btnOperatoradd.setBackground(Color.GRAY);
		btnOperatoradd.setForeground(Color.WHITE);
		
		
		btnNum04 = new JButton("4");		
		btnNum04 = createNumberButton("4");
		btnNum05 = new JButton("5");		
		btnNum05 = createNumberButton("5");
		btnNum06 = new JButton("6");		
		btnNum06 = createNumberButton("6");
		btnOperatorsub = new JButton("-");
		btnOperatorsub.setBackground(Color.GRAY);
		btnOperatorsub.setForeground(Color.WHITE);
		
		btnNum01 = new JButton("1");
		btnNum01 = createNumberButton("1");
		btnNum02 = new JButton("2");
		btnNum02 = createNumberButton("2");
		btnNum03 = new JButton("3");
		btnNum03 = createNumberButton("3");
		btnNum00 = new JButton("0");		
		btnNum00 = createNumberButton("0");
		
		controlPanel.add(btnClear);
		controlPanel.add(btnOperatordiv);
		controlPanel.add(btnOperatormul);
		controlPanel.add(btnCommandRun);
		controlPanel.add(btnNum07);
		controlPanel.add(btnNum08);
		controlPanel.add(btnNum09);
		controlPanel.add(btnOperatoradd);
		controlPanel.add(btnNum04);
		controlPanel.add(btnNum05);
		controlPanel.add(btnNum06);
		controlPanel.add(btnOperatorsub);
		controlPanel.add(btnNum01);
		controlPanel.add(btnNum02);
		controlPanel.add(btnNum03);
		controlPanel.add(btnNum00);
		
		f.add(tfResult);
		f.add(controlPanel);
		f.setResizable(false);
		f.setVisible(true); 
	
	}
	 private JButton createNumberButton(final String number) {
	        JButton button = new JButton(number);
	        button.setBackground(Color.BLACK);
	        button.setForeground(Color.WHITE);
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                currentInput.append(number); // 숫자를 현재 입력에 추가
	                updateDisplay();
	            }
	        });
	        return button;
	    }

	    // 나머지 버튼 생성 및 리스너 추가 코드는 유지됩니다.
	    
	    // 업데이트 메서드를 수정하여 StringBuilder에서 문자열로 변환하여 표시합니다.
	    private void updateDisplay() {
	        tfResult.setText(currentInput.toString());
	    }
	
	public static void main(String[] args) {
		new Calculatortest();
	}

}
