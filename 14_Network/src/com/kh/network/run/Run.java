package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {

		/*
		 * ��Ʈ��ũ : ��� ������ �� �� �̻��� ��ġ���� ������ �Ǵ� �������� ������ ȯ��
		 * ��Ʈ��ũ�� ���� : �������� ��ȯ
		 * ����� ������ ��ġ�� �Ϲ������� Host��� ��Ī�ϸ�, ���ܰ��� ���� ��� ��ġ�� EndPoint��� ǥ���Ѵ�.
		 * 
		 * �ּҷδ� MAC(Media Access Controller) Address �� IP(Internet Protocol) Address �� ������ ����.
		 * - MAC Address : NIC(Network Interface Card)�� ���� ������ �ٿ����� �������� �ּ�
		 * - IP Address : Internet �󿡼� �� Host���� �ĺ��� �� �ִ� ������ �ּ�
		 * 
		 * - Port Number : Host ���ο��� �۵��ϴ� Process�� �ĺ��� �� ����ϴ� ���� ��ȣ
		 * 
		 * MAC -> �̷л����δ� �������� �������̳� �����δ� ������ Ȱ���Ͽ� ���������� �����.
		 * IP �ּҿ� Port ��ȣ�� �׻� �������� �ƴ϶� ������ ������ �������� ��.
		 * ��, ���� �ٲ� �� IP �ּҴ� ���� ��Ʈ��ũ ���� �ȿ���, Port ��ȣ�� ��ǻ�� ���ο��� �ߺ��� �߻����� �ʾƾ� �Ѵ�.
		 * �ߺ��� �߻��� ��� �浹�� �Ͼ�� ����.
		 * 
		 * - Server �� Client
		 * 
		 * Server : Client(�����)���� ���񽺸� �������ִ� �������� ��ǻ�� �Ǵ� ���α׷�. ��, Client�� ��û�� ���� ������ �������ִ� ���� ������
		 * Client : Server���� ���񽺸� ��û�ϴ� �������� ��ǻ�� �Ǵ� ���α׷�. ��, ���񽺸� �����޴� ��
		 * 
		 * -> ������ �ڱ� ȥ�� ������ ���� �� ����. �� Ŭ���̾�Ʈ�� ��û�� ���;߸� ������ ���� �� �ִ� ����
		 * -> Ŭ���̾�Ʈ�� ������ ��û�� ������ ���ؼ� ������ IP �ּҿ� Port ��ȣ�� �˾ƾ� ��.
		 * 
		 */
		
		
		//InetAddress : ��Ʈ��ũ ������ Ȯ���� �� �ִ� Ŭ����
		try {
		InetAddress localHost = InetAddress.getLocalHost();
			// localHost : ���� ���α׷��� ���۽�Ų ��ġ�� �ǹ�
			// getLocalHost : �۾����� Host�� ������ ��ȯ���ִ� �޼ҵ�
		
			System.out.println(localHost); // PC �̸� / IP �ּҸ� ���� ��ɾ�
			System.out.println(localHost.getHostName()); // PC �̸��� ����
			System.out.println(localHost.getHostAddress()); // IP �ּҸ� ���� ���� ��ɾ�
			
			System.out.println("======================");
			
			// �����γ����� ���ؼ� ������ǻ�Ϳ� ���õ� ������ �� �� ����
			// DomainName(DNS) : ����ڰ� ���񽺸� �̿��� �� ����� ���� ������ �����Ǵ� �̸�
			// www.google.com -> hosts ���� -> DNS(Domain Name System)
			// google ������ IP �ּҸ� �������� �������� HTTP(s) ��û��.
			
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // getByName() : ������ ������ �̿��� ������ ������ ��ȯ�ϴ� ��ɾ�
			System.out.println(googleHost);
			System.out.println(googleHost.getHostName());
			System.out.println(googleHost.getHostAddress()); // ���������� ����Ʈ�� �����ΰ� IP �ּҸ� ������ ���� �͵� ����.
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		/*
		 * Client - Server Model
		 * 
		 *  ���� �������� ������ �����Ѵٸ� Ŭ���̾�Ʈ�� ������ ������ ��û�� ���� �� �ִ�. -> �� ��� ������ ������ ���� ����� �����־�� �Ѵ�.
		 *  
		 *  "��û(request)"�� "����(response)"���� ���α׷��� ����(���)��
		 *  �������� ��� ��� : Hyper-Text Transfer Protocol Secure
		 *  
		 *  ���� �ڹٸ��� �̿��ؼ� Ŭ���̾�Ʈ�� ������ ������ ��� �غ���
		 *  
		 *  Process(���α׷��� �޸𸮿� ����� ����) ���� ����� ���
		 *  
		 */
		
	}
	
	// �ڹٸ� �̿��� �۾� ������� �ҽ� �ڵ�. �̰� ������ �� �����Ͽ� ������� ������ �� �ִ� ������ ������� ���α׷�,

}
