package aWorldOnlySingleWheel;

public class GGpeople {
	private int level=0;
	private String background="����";
	private String sex="";
	private String name;
	public GGpeople(int l,String b,String s,String n) {
		level=l;
		background=b;
		sex=s;
		name=n;
		System.out.println("����"+name+"�ȼ�Ϊ"+"��"+background+"�û�,������!");
	}
	public GGpeople() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getBackground() {
		return background;
	}
	public void setLevel(int level) {
		if (level>0&&level<=1000) {
			
			this.level = level;
		}
		if (level==1000) {
			System.out.println("������,��Զ����");
		}
	}
	public int getLevel() {
		return level;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void ligong() {
		System.out.println("�������ǻ�����,��������������!");
	}
}
