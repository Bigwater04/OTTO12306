package aWorldOnlySingleWheel;

public class GGpeople {
	private int level=0;
	private String background="白字";
	private String sex="";
	private String name;
	public GGpeople(int l,String b,String s,String n) {
		level=l;
		background=b;
		sex=s;
		name=n;
		System.out.println("姓名"+name+"等级为"+"的"+background+"用户,他来了!");
	}
	public GGpeople() {
		// TODO 自动生成的构造函数存根
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
			System.out.println("尊尼获加,永远的神");
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
		System.out.println("棍哥我们回来啦,棍哥我们立功啦!");
	}
}
