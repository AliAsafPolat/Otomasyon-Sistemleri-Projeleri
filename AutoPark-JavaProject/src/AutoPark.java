import java.util.ArrayList;

public class AutoPark {

	private String name;
	private ArrayList <SubscribedVehicle> SubscribedVehicles; 
	private ArrayList <ParkRecord> ParkRecords;
	private double hourlyFee;
	private double incomeDaily;
	private int capacity;
	private int size;
	
	
	public AutoPark(String name,double fee,int capacity) {
		this.hourlyFee=fee;
		this.name=name;
		SubscribedVehicles=new ArrayList<SubscribedVehicle>();
		ParkRecords=new ArrayList<ParkRecord>();
		
		if(capacity>0)				//sýfýrýn altýnda kapasite olamaz.
		this.capacity=capacity;
		else this.capacity=0;
		this.size=capacity;
	}
	
	public SubscribedVehicle searchVehicle(String plate) {
		for(SubscribedVehicle s:SubscribedVehicles)				//Eðer kayýtlýlarda bulursa döndür.
			if(s.getPlate().compareTo(plate)==0)
				return s;
		
		return null;
	}
	
	public boolean isParked(String plate) {						//Park edilip edilmediðini kontrol eder.
		for(ParkRecord x:ParkRecords)
			if(x.getVehicle().getPlate().compareTo(plate)==0)
				if(x.getExitTime()==null)							//Park recorda giriþ girilip çýkýþ girilmediyse demek ki
					return true;									//araç hala içeridedir.
		
		return false;
	}
	
	public boolean addVehicle(SubscribedVehicle subcribedVehicle) {
		SubscribedVehicle araç=searchVehicle(subcribedVehicle.getPlate());
		if(araç!=null) {
			if(!araç.getSubscription().isValid()) {
				SubscribedVehicles.remove(araç);		//Eðer aracýn daha önceden üyeliði var ve bittiyse yenile
				SubscribedVehicles.add(subcribedVehicle);				//Öncekini çýkar yeni gelen objeyi ekle..
				return true;	
			}else
				return false;
		}
		
		SubscribedVehicles.add(subcribedVehicle);						//Eðer üyeliði yoksa direkt ekle.
		return true;
	}
	
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial) {	//Otoparka araç giriþidir.
	
		if( size > 0 && !isParked(plate) ) {				//Eðer araba þuan park halinde deðilse ve otoparkta yer varsa gir.
			
			if(isOfficial) {
				OfficialVehicle of=new OfficialVehicle(plate);
				size--;
				ParkRecord record=new ParkRecord(enter,of);
				ParkRecords.add(record);
				return true;
			}
			
			SubscribedVehicle araba=searchVehicle(plate);
			if(araba!=null) {
				ParkRecord rec=new ParkRecord(enter,araba);	//Eðer araba daha önce geldiyse onun kaydýne ekle
				ParkRecords.add(rec);
			}else {
				RegularVehicle regVehicle=new RegularVehicle(plate);
				ParkRecord record=new ParkRecord(enter, regVehicle);
				ParkRecords.add(record);
			}
			size--;
			return true;
		}
		
		return false;
	}
	
	public boolean vehicleExits(String plate,Time exit) {
		
		ParkRecord record=getParkRecord(plate);
		if(record==null||record.getEnterTime().isAfterThan(exit)) 
			return false;
		
		record.setExitTime(exit);
		size++;
			
		if( record.getVehicle().isSpecial() || 
				( record.getVehicle().getSubscription()!=null && record.getVehicle().getSubscription().isValid()))
			return true;                				// do not take money from subscriptions or official ones
	
		incomeDaily += record.getParkingDuration() * hourlyFee;
	
		return true;	
	}
	
	private ParkRecord getParkRecord(String plate){
	    for(ParkRecord parkRecord : ParkRecords)
	        if(parkRecord.getVehicle().getPlate().equalsIgnoreCase(plate) && parkRecord.getExitTime() == null  )
	            return parkRecord;
	    return null;
	}
	
	public String iceridekiAraclar() {
		String araçlar="";
		for(ParkRecord x:ParkRecords) 
			if(x.getExitTime()==null)
				araçlar=araçlar+x.getVehicle().getPlate()+"\n";
		
		if(araçlar!="")
			return araçlar;
		else
			return"Otoparkta araç bulunmamaktadýr.";
		
	}
	
	public Double getIncomeDaily() {
		return incomeDaily;
	}
	
	public String toString() {
		String taným = this.name + " Otoparký\n\nKayýtlý Araçlar :\n";
	
		for(SubscribedVehicle x:SubscribedVehicles)
			if(x.getSubscription().isValid())
				taným+=x.toString()+"\n";
		
		return taným;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<SubscribedVehicle> getSubscribedVehicles() {
		return SubscribedVehicles;
	}
	
	public void setSubscribedVehicles(ArrayList<SubscribedVehicle> subscribedVehicles) {
		SubscribedVehicles = subscribedVehicles;
	}
	
	public ArrayList<ParkRecord> getParkRecords() {
		return ParkRecords;
	}
	
	public void setParkRecords(ArrayList<ParkRecord> parkRecords) {
		ParkRecords = parkRecords;
	}
	
	public Double getHourlyFee() {
		return hourlyFee;
	}
	
	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	
	public boolean setCapacity(int capacity) {
		if(this.capacity>capacity)
			return false;
		
		this.capacity = capacity;
		
		return true;
	}
	
	public Integer getSize() {
		return size;
	}
	
	public void setSize(int capCount) {
		size = capCount;
	}
	
	public void setIncomeDaily(double incomeDaily) {
		this.incomeDaily = incomeDaily;
	}
	


}
