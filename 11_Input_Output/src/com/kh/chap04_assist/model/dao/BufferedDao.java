package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// ��� ��Ʈ���� input / output �迭�� ��� ������Ʈ���� input / output �迭�� ���
	// ��� ��Ʈ���� Reader / Writer �迭�� ��� ������Ʈ���� Reader / Writer �迭�� ���
	
	// BufferedReader, BufferedWriter -> �ӵ� ����� ������ ������Ʈ�� -> �ӽð����� �����ؼ� �� ���� ��Ƶξ��ٰ� �Ѳ����� ������� ������.
	// ǥ����
	// ��ݽ�Ʈ��Ŭ�����̸� ��ݽ�Ʈ�� = new ��ݽ�Ʈ��������(�ܺθ�ü���ڰ�);
	// ������Ʈ��Ŭ�����̸� ������Ʈ�� = new ������Ʈ��������(��ݽ�Ʈ��);
	
	// ���
	public void outputFile() {
		// BufferedWriter
		
		// 0. ���� ���� 
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		// 1. ��ü ����
		
		try {
		fw = new FileWriter("c_buffer.txt");
		bw = new BufferedWriter(fw);
		
		// 2. ��� -> write()
		bw.write("�ȳ��ϼ���");
		bw.newLine();
		bw.write("�ݰ����ϴ�.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 3. �ڿ��ݳ� -> close()
			// �ڿ��ݳ��� �ݵ�� ������ �������� �̷����.
			try {
				if(bw != null) {
				bw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
			if(fw != null) {
				fw.close();
			} 
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	// �Է�
	public void inputFile() {
		//FileReader�� ������� BufferedReader�� ����ؼ� �Է¹ޱ�
	
	//~ try(BufferedReader bfr = new BufferedReader(new FileReader("c_buffer.txt"))) {
		String str = "";
		//~ while((Str = bfr.readLine()) != null) {
			
	}
	}
	
	
	

