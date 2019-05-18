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
		
		if(capacity>0)				//s�f�r�n alt�nda kapasite olamaz.
		this.capacity=capacity;
		else this.capacity=0;
		this.size=capacity;
	}
	
	public SubscribedVehicle searchVehicle(String plate) {
		for(SubscribedVehicle s:SubscribedVehicles)				//E�er kay�tl�larda bulursa d�nd�r.
			if(s.getPlate().compareTo(plate)==0)
				return s;
		
		return null;
	}
	
	public boolean isParked(String plate) {						//Park edilip edilmedi�ini kontrol eder.
		for(ParkRecord x:ParkRecords)
			if(x.getVehicle().getPlate().compareTo(plate)==0)
				if(x.getExitTime()==null)							//Park recorda giri� girilip ��k�� girilmediyse demek ki
					return true;									//ara� hala i�eridedir.
		
		return false;
	}
	
	public boolean addVehicle(SubscribedVehicle subcribedVehicle) {
		SubscribedVehicle ara�=searchVehicle(subcribedVehicle.getPlate());
		if(ara�!=null) {
			if(!ara�.getSubscription().isValid()) {
				SubscribedVehicles.remove(ara�);		//E�er arac�n daha �nceden �yeli�i var ve bittiyse yenile
				SubscribedVehicles.add(subcribedVehicle);				//�ncekini ��kar yeni gelen objeyi ekle..
				return true;	
			}else
				return false;
		}
		
		SubscribedVehicles.add(subcribedVehicle);						//E�er �yeli�i yoksa direkt ekle.
		return true;
	}
	
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial) {	//Otoparka ara� giri�idir.
	
		if( size > 0 && !isParked(plate) ) {				//E�er araba �uan park halinde de�ilse ve otoparkta yer varsa gir.
			
			if(isOfficial) {
				OfficialVehicle of=new OfficialVehicle(plate);
				size--;
				ParkRecord record=new ParkRecord(enter,of);
				ParkRecords.add(record);
				return true;
			}
			
			SubscribedVehicle araba=searchVehicle(plate);
			if(araba!=null) {
				ParkRecord rec=new ParkRecord(enter,araba);	//E�er araba daha �nce geldiyse onun kayd�ne ekle
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
		String ara�lar="";
		for(ParkRecord x:ParkRecords) 
			if(x.getExitTime()==null)
				ara�lar=ara�lar+x.getVehicle().getPlate()+"\n";
		
		if(ara�lar!="")
			return ara�lar;
		else
			return"Otoparkta ara� bulunmamaktad�r.";
		
	}
	
	public Double getIncomeDaily() {
		return incomeDaily;
	}
	
	public String toString() {
		String tan�m = this.name + " Otopark�\n\nKay�tl� Ara�lar :\n";
	
		for(SubscribedVehicle x:SubscribedVehicles)
			if(x.getSubscription().isValid())
				tan�m+=x.toString()+"\n";
		
		return tan�m;
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
