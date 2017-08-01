package com.jln.Dto;

public class SurveyDto {
	/**
	 * 	序号	
	 */
	private int peopleid;
	/**
	 * 1.性别
	 */
	private int sex;
	/**
	 * 2.年龄
	 */
	private int age;
	/**
	 * 3.职业
	 */
	private String job; 
	/**
	 * 4.月收入
	 */
	private int incomPerMouth;
	/**
	 * 5.家庭小汽车拥有量	
	 */
	private int owncars;
	/**
	 * 6.附近300米范围内是否有公交站	
	 */
	private int busStop300; 
	/**
	 * 7.附近500米范围内是否有公交站
	 */
	private int busStop500;
	/**
	 * 8.乘坐公交车出行的车外行程时间	
	 */
	private double busExceptTime;
	/**
	 * 9.附近800范围内是否有地铁站
	 */
	private int subwayStop800;
	/**
	 * 10.附近1500米范围内是否有地铁站	
	 */
	private int subwayStop1500;
	/**
	 * 11.乘坐地跌出行的车外行程时间
	 */
	private double subwayExceptTime;
	/**
	 * 载运工具：12.(小汽车)	12.(公交车)	12.(地铁)	12.(出租车)	12.(非机动车)	12.(通勤班车)
	 */
	private String vehicleType12;
	/**
	 * 同行人  ：13.(独自一人)	13.(父母)	13.(心仪的人)	13.(孩子)	13.(朋友)	13.(其他家庭成员)	13.(工作伙伴)
	 */
	private String companion;
	/**
	 * 14.对当前公共交通服务水平的满意度
	 */
	private String currentSatisfaction;
	/**
	 * 15.居住地(环)	15.居住地(区)	15.居住地(街道名称/附近道路名称/附近地铁站名称)	
	 */
	private String address;
	/**
	 * 16.每周工作日使用小汽车的频率	
	 */
	private int useCarPerWeek;
	/**
	 * 17.尾号限行时，如果不能开车，您选择的交通方式是
	 */
	private String typeChooseLimitTraffic;
	/**
	 *17+.与小汽车相比，您得出行幸福感 
	 */
	private String happinessCompareCar;
	/**
	 * 18.您认为自己的通勤距离
	 */
	private double yourDistance;
	/**
	 * 19.是否在意自己的通勤成本	
	 */
	private int careCommuteCost;
	/**
	 * 20.小汽车出行成本占家庭支出成本的比重
	 */
	private int carCostWeight;
	/**
	 * 21.通勤时间(小时)	21.(分)
	 */
	private int spentTime;
	/**
	 * 22.对自己的通勤时间是否满意
	 */
	private int isSatisfationTime;
	/**
	 * 23.对整个通勤出行过程的评价
	 */
	private String evaluateProcess;
	/**
	 * 24.对自己开车通勤幸福感的评价
	 */
	private String evaluateHappiness;
	/**
	 * 25.工作地(环)	25.工作地(区)	25.工作地(街道名称/附近道路名称/附近地铁站名称)
	 */
	private WorkPlace workPlace;
	/**
	 * 26.通勤时间增加10%，是否会改变自己的行为
	 */
	private int changeTypeTimeAdd10;
	/**
	 * 27.通勤时间增加20%，是否会改变自己的行为	
	 */
	private int changeTypeTimeAdd20;
	/**
	 * 29.通勤时间增加40%，是否会改变自己的行为	
	 */
	private int changeTypeTimeAdd40;
	/**
	 * 30.会做出何种改变
	 */
	  private String TimeChange2whatChange;
	  /**
	   * 31.会改到哪种交通方式	
	   */
	  private String TimeChange2TypeChange;
	  /**
	   * 32.收费为5元，是否会改变自己的行为
	   */
	  private int changeTypeMoney5;
	  /**
	   * 34.收费为10元，是否会改变自己的行为
	   */
	  private int changeTypeMoney10;
	  /**
	   * 35.收费为15元，是否会改变自己的行为	
	   */
		private int changeTypeMoney15;
		/**
		 * 36.收费为20元，是否会改变自己的行为	
		 */
	private int changeTypeMoney20;
	/**
	 * 37.收费为25元，是否会改变自己的行为
	 */
	private int changeTypeMoney25;
	/**
	 * 38.会做出何种改变
	 */
	private String moneyChange2whatChange;
	/**
	 * 39.会改到哪种交通方式
	 */
	private String  moneyChange2TypeChange;
	/**
	 * 40.地铁便利性增加，您会尝试使用地铁通勤吗？
	 */
	private int convenienceAdd2subway;
	
	/**
	 * 41.地铁舒适性增加，您会尝试使用地铁通勤吗？	
	 */
	private int comfortAdd2subway;
	/**
	 * 42.公交舒适性增加，您会尝试使用公交通勤吗？
	 */
	private int comfortAdd2bus;
	/**
	 * 43.公交便利性增加，您会尝试使用公交通勤吗？
	 */
	private int convenienceAdd2bus;
/**
 * 44.公交快捷性增加，您会尝试使用公交通勤吗？
 */
	private int rapidityAdd2bus;
	/**
	 * 45.公交可靠性增加，您会尝试使用公交通勤吗？
	 */
	private int reliabilityAdd2bus;
	/**
	 * 46.政策场景实施后，对自己开车通勤幸福感的评价
	 */
	private String happinessAfterPolicy;
	/**
	 * 	47.开车通勤幸福感较之前
	 */
	private String happinessCompareBefore;
	public int getPeopleid() {
		return peopleid;
	}
	public void setPeopleid(int peopleid) {
		this.peopleid = peopleid;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getIncomPerMouth() {
		return incomPerMouth;
	}
	public void setIncomPerMouth(int incomPerMouth) {
		this.incomPerMouth = incomPerMouth;
	}
	public int getOwncars() {
		return owncars;
	}
	public void setOwncars(int owncars) {
		this.owncars = owncars;
	}
	public int getBusStop300() {
		return busStop300;
	}
	public void setBusStop300(int busStop300) {
		this.busStop300 = busStop300;
	}
	public int getBusStop500() {
		return busStop500;
	}
	public void setBusStop500(int busStop500) {
		this.busStop500 = busStop500;
	}
	public double getBusExceptTime() {
		return busExceptTime;
	}
	public void setBusExceptTime(double busExceptTime) {
		this.busExceptTime = busExceptTime;
	}
	public int getSubwayStop800() {
		return subwayStop800;
	}
	public void setSubwayStop800(int subwayStop800) {
		this.subwayStop800 = subwayStop800;
	}
	public int getSubwayStop1500() {
		return subwayStop1500;
	}
	public void setSubwayStop1500(int subwayStop1500) {
		this.subwayStop1500 = subwayStop1500;
	}
	public double getSubwayExceptTime() {
		return subwayExceptTime;
	}
	public void setSubwayExceptTime(double subwayExceptTime) {
		this.subwayExceptTime = subwayExceptTime;
	}
	public String getVehicleType12() {
		return vehicleType12;
	}
	public void setVehicleType12(String vehicleType12) {
		this.vehicleType12 = vehicleType12;
	}
	public String getCompanion() {
		return companion;
	}
	public void setCompanion(String companion) {
		this.companion = companion;
	}
	public String getCurrentSatisfaction() {
		return currentSatisfaction;
	}
	public void setCurrentSatisfaction(String currentSatisfaction) {
		this.currentSatisfaction = currentSatisfaction;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUseCarPerWeek() {
		return useCarPerWeek;
	}
	public void setUseCarPerWeek(int useCarPerWeek) {
		this.useCarPerWeek = useCarPerWeek;
	}
	public String getTypeChooseLimitTraffic() {
		return typeChooseLimitTraffic;
	}
	public void setTypeChooseLimitTraffic(String typeChooseLimitTraffic) {
		this.typeChooseLimitTraffic = typeChooseLimitTraffic;
	}
	public String getHappinessCompareCar() {
		return happinessCompareCar;
	}
	public void setHappinessCompareCar(String happinessCompareCar) {
		this.happinessCompareCar = happinessCompareCar;
	}
	public double getYourDistance() {
		return yourDistance;
	}
	public void setYourDistance(double yourDistance) {
		this.yourDistance = yourDistance;
	}
	public int getCareCommuteCost() {
		return careCommuteCost;
	}
	public void setCareCommuteCost(int careCommuteCost) {
		this.careCommuteCost = careCommuteCost;
	}
	public int getCarCostWeight() {
		return carCostWeight;
	}
	public void setCarCostWeight(int carCostWeight) {
		this.carCostWeight = carCostWeight;
	}
	public int getSpentTime() {
		return spentTime;
	}
	public void setSpentTime(int spentTime) {
		this.spentTime = spentTime;
	}
	public int getIsSatisfationTime() {
		return isSatisfationTime;
	}
	public void setIsSatisfationTime(int isSatisfationTime) {
		this.isSatisfationTime = isSatisfationTime;
	}
	public String getEvaluateProcess() {
		return evaluateProcess;
	}
	public void setEvaluateProcess(String evaluateProcess) {
		this.evaluateProcess = evaluateProcess;
	}
	public String getEvaluateHappiness() {
		return evaluateHappiness;
	}
	public void setEvaluateHappiness(String evaluateHappiness) {
		this.evaluateHappiness = evaluateHappiness;
	}
	public WorkPlace getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(WorkPlace workPlace) {
		this.workPlace = workPlace;
	}
	public int getChangeTypeTimeAdd10() {
		return changeTypeTimeAdd10;
	}
	public void setChangeTypeTimeAdd10(int changeTypeTimeAdd10) {
		this.changeTypeTimeAdd10 = changeTypeTimeAdd10;
	}
	public int getChangeTypeTimeAdd20() {
		return changeTypeTimeAdd20;
	}
	public void setChangeTypeTimeAdd20(int changeTypeTimeAdd20) {
		this.changeTypeTimeAdd20 = changeTypeTimeAdd20;
	}
	public int getChangeTypeTimeAdd40() {
		return changeTypeTimeAdd40;
	}
	public void setChangeTypeTimeAdd40(int changeTypeTimeAdd40) {
		this.changeTypeTimeAdd40 = changeTypeTimeAdd40;
	}
	public String getTimeChange2whatChange() {
		return TimeChange2whatChange;
	}
	public void setTimeChange2whatChange(String timeChange2whatChange) {
		TimeChange2whatChange = timeChange2whatChange;
	}
	public String getTimeChange2TypeChange() {
		return TimeChange2TypeChange;
	}
	public void setTimeChange2TypeChange(String timeChange2TypeChange) {
		TimeChange2TypeChange = timeChange2TypeChange;
	}
	public int getChangeTypeMoney5() {
		return changeTypeMoney5;
	}
	public void setChangeTypeMoney5(int changeTypeMoney5) {
		this.changeTypeMoney5 = changeTypeMoney5;
	}
	public int getChangeTypeMoney10() {
		return changeTypeMoney10;
	}
	public void setChangeTypeMoney10(int changeTypeMoney10) {
		this.changeTypeMoney10 = changeTypeMoney10;
	}
	public int getChangeTypeMoney15() {
		return changeTypeMoney15;
	}
	public void setChangeTypeMoney15(int changeTypeMoney15) {
		this.changeTypeMoney15 = changeTypeMoney15;
	}
	public int getChangeTypeMoney20() {
		return changeTypeMoney20;
	}
	public void setChangeTypeMoney20(int changeTypeMoney20) {
		this.changeTypeMoney20 = changeTypeMoney20;
	}
	public int getChangeTypeMoney25() {
		return changeTypeMoney25;
	}
	public void setChangeTypeMoney25(int changeTypeMoney25) {
		this.changeTypeMoney25 = changeTypeMoney25;
	}
	public String getMoneyChange2whatChange() {
		return moneyChange2whatChange;
	}
	public void setMoneyChange2whatChange(String moneyChange2whatChange) {
		this.moneyChange2whatChange = moneyChange2whatChange;
	}
	public String getMoneyChange2TypeChange() {
		return moneyChange2TypeChange;
	}
	public void setMoneyChange2TypeChange(String moneyChange2TypeChange) {
		this.moneyChange2TypeChange = moneyChange2TypeChange;
	}
	public int getConvenienceAdd2subway() {
		return convenienceAdd2subway;
	}
	public void setConvenienceAdd2subway(int convenienceAdd2subway) {
		this.convenienceAdd2subway = convenienceAdd2subway;
	}
	public int getComfortAdd2subway() {
		return comfortAdd2subway;
	}
	public void setComfortAdd2subway(int comfortAdd2subway) {
		this.comfortAdd2subway = comfortAdd2subway;
	}
	public int getComfortAdd2bus() {
		return comfortAdd2bus;
	}
	public void setComfortAdd2bus(int comfortAdd2bus) {
		this.comfortAdd2bus = comfortAdd2bus;
	}
	public int getConvenienceAdd2bus() {
		return convenienceAdd2bus;
	}
	public void setConvenienceAdd2bus(int convenienceAdd2bus) {
		this.convenienceAdd2bus = convenienceAdd2bus;
	}
	public int getRapidityAdd2bus() {
		return rapidityAdd2bus;
	}
	public void setRapidityAdd2bus(int rapidityAdd2bus) {
		this.rapidityAdd2bus = rapidityAdd2bus;
	}
	public int getReliabilityAdd2bus() {
		return reliabilityAdd2bus;
	}
	public void setReliabilityAdd2bus(int reliabilityAdd2bus) {
		this.reliabilityAdd2bus = reliabilityAdd2bus;
	}
	public String getHappinessAfterPolicy() {
		return happinessAfterPolicy;
	}
	public void setHappinessAfterPolicy(String happinessAfterPolicy) {
		this.happinessAfterPolicy = happinessAfterPolicy;
	}
	public String getHappinessCompareBefore() {
		return happinessCompareBefore;
	}
	public void setHappinessCompareBefore(String happinessCompareBefore) {
		this.happinessCompareBefore = happinessCompareBefore;
	}
	
}
