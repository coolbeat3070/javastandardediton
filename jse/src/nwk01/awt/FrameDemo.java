package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/*
AWT (Abstract Windows Toolkit)
: GUI (Graphic User Interface) ȯ���� ���α׷� �� �ȵ���̵� ������ ���
������Ʈ : ����� �������̽��� �����ϴ� �⺻���.
	��ư, üũ�ڽ�, ���̺�, �ؽ�Ʈ�ʵ�, ����Ʈ, �˾��޴� �� ����
	�μ�ǰ�� ��Ī. �ڹٿ����� Component Ŭ������ �ִµ� ��� ���۳�Ʈ��
	�� Component �� �ڼ��̴�.
�����̳� : Component �� �ļ��߿��� Container ��� Ŭ������ �ִµ�
	�� Ŭ������ �ڼ��� ��Ī�Ѵ�. �����̳ʴ� ������Ʈ�� �����ϴ� ���� ���
	������ ���� ���� ���ϸ� ������, ������, �г�, ���̾�α� �ڽ����� �ִ�.
	(�ٸ� ������Ʈ���� ���� �� �ִ� ������Ʈ)
���̾ƿ� : �����̳ʿ� ������Ʈ�� ���� �� � ������ ��ġ�ϴ� ���� �߿��ѵ�
	�̰��� ���̾ƿ��̶�� �Ѵ�.
�̺�Ʈ : ����ڷκ��� �Է��� �Ͼ�� �׿� ���� �����ϵ��� �����ϴ� ��� ����� ���Ѵ�.
 * */
public class FrameDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 * */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300); // (�ʺ�, ����)
		// Toolkit �� ��ü�� ������ ��
		// Toolkit toolkit = new Toolkit(); �̶�� �ϸ鼭 ����� ���� �ƴ϶�
		// ����ƽ �޼ҵ带 ���� ��������(��ü)�� �����Ѵ�.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// �������ڿ��� ȭ��ũ�⸦ �����ϴ� ����� ���� ��ü�� dim ���� �־���.
		Dimension dim = toolkit.getScreenSize();
		
		/*
		 * [2] ������Ʈ�� ȭ�鿡 ����
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		// �������� ��ǥ���� ���� ȭ�鿡�� �������µ�
		// �� ���ó�� �ϸ� ������ ��ġ�� �ƴ�, ȭ��ũ�⿡ ����
		// �������� ��ȭ�ȴ�. �� , 14��ġ ȭ���̵� 6��ġ ����Ʈ���̵�
		// ��� �뿡 �������� �������� �ȴ�.
		frame.setVisible(true);
	}
	
}