import java.util.*;
class ProgrammingLang
{
	private String language;
	public String getlang()
	{
		return language;
	}
	public void setlang(String lang)
	{
		language = lang;
	}
}

class Developer
{
	List<ProgrammingLang> language;
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public List<ProgrammingLang> getlanguage()
	{
		return language;
	}
	public void setlanguage(List<ProgrammingLang> language)
	{
		this.language = language;
	}
	
}

class as
{
	public static void main(String args[])
	{
		Developer d = new Developer();
		d.setname("ashok");
		ProgrammingLang l = new ProgrammingLang();
		l.setlang("java");
		List<ProgrammingLang> list1 = new ArrayList<ProgrammingLang>();
		list1.add(l);
		d.setlanguage(list1);
		System.out.println(d.getname());
		System.out.println(l.getlang());
		
	}
}