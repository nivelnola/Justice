public class Driver {
    //Methods
    public static void main(String[] args) {
	Vigilante a = new Vigilante("Vig 1");
	Consigliere b = new Consigliere("Consig 1");
	System.out.println("###CHARACTER CREATION###");
	System.out.println(a);
	System.out.println(b);
	Vigilante c = new Vigilante("Vig 2");
	Consigliere d = new Consigliere("Consig 2");
	System.out.println("###CONSIG TESTS###");
	b.check();
	b.search(c);
	b.search(d);
	b.check();
	System.out.println("###ATTACK TESTS###");
	a.attack(c);
	b.attack(d);
	System.out.println(c);
	System.out.println(d);
	System.out.println("###VIG TESTS###");
	a.suicide();
	a.fire(b);
	a.fire(d);
	a.fire(b);
	a.fire(c);
	c.fire(a);
	c.suicide();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println("###ISALIVE TESTS###");
	a.isAlive();
	b.isAlive();
        c.isAlive();
	d.isAlive();
    }
}
