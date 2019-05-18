
public class test {
	public static void main(String[] args) {
					
		AutoPark otopark=new AutoPark("Asaf", 5, 2);
		
		SubscribedVehicle v1=new SubscribedVehicle("10 KC 707");
		SubscribedVehicle v2=new SubscribedVehicle("15 RC 907");
		SubscribedVehicle v3=new SubscribedVehicle("16 IC 807");
		RegularVehicle v4=new RegularVehicle("34 SS 076");
		RegularVehicle v5=new RegularVehicle("34 YT 206");
		RegularVehicle v6=new RegularVehicle("34 EF 276");
		OfficialVehicle v7=new OfficialVehicle("35 TR 1905");
		OfficialVehicle v8=new OfficialVehicle("34 PR 905");
		
		Date tarih1=new Date(10, 10, 2010);
		Date tarih2=new Date(15, 12, 2020);
		Date tarih3=new Date(12, 10, 2008);
		Date tarih4=new Date(10, 10, 2018);
		Date tarih5=new Date(10, 10, 2009);
		Date tarih6=new Date(10, 10, 2019);
		Date tarih7=new Date(10, 10, 2015);
		Date tarih8=new Date(10, 10, 2021);
		Date tarih9=new Date(10, 10, 2007);
		Date tarih10=new Date(10, 10, 2010);
		Date tarih11=new Date(10, 10, 2011);
		Date tarih12=new Date(10, 10, 2013);
		
		
				
		Subscription subs1=new Subscription(tarih1,tarih2,v4.getPlate());
	//	System.out.println(v4.getSubscription());
		Subscription subs2=new Subscription(tarih3,tarih4);
		Subscription subs3=new Subscription(tarih5,tarih6);
		Subscription subs4=new Subscription(tarih7,tarih8);
		Subscription subs5=new Subscription(tarih9,tarih10);
		Subscription subs6=new Subscription(tarih11,tarih12);
		
		v1.setSubscription(subs2);
		v2.setSubscription(subs3);
		v3.setSubscription(subs4);
		
		otopark.addVehicle(subs1.getVehicle());
		otopark.addVehicle(v1);
		otopark.addVehicle(v2);
		otopark.addVehicle(v3);
		
		Time t=new Time(1,15);
		Time z=new Time(4,15);
	/*
		if(otopark.vehicleEnters(v1.getPlate(), t, v1.isSpecial()))
			System.out.println(v1.getPlate()+ " Giriþ yaptý.");
		
		System.out.println("Güncel kazanç : "+otopark.getIncomeDaily());
		
		
		if(otopark.vehicleExits(v1.getPlate(), z))
			System.out.println(v1.getPlate()+ " Çýkýþ yaptý");
		System.out.println("Güncel kazanç : "+otopark.getIncomeDaily());
		
		*/
		
		AutoParkGUI gui=new AutoParkGUI(otopark,otopark.getIncomeDaily());
		gui.open();
		
		/*
		System.out.println(otopark.toString());
		
		Time t=new Time(1,15);
		Time x=new Time(4,15);
		if(otopark.vehicleEnters("34 PR 905", t, true))
			System.out.println("Giriþ yapýldý.");
		
		if(otopark.vehicleExits("34 PR 905" ,x))
		System.out.println("Çýkýþ yapýldý");
		else
			System.out.println("Araç bulunamadý");
		
		System.out.println("Güncel kazanç : "+otopark.getIncomeDaily());*/
	}
}
