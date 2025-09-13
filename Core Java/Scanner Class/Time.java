class Time {
	int hr,min,sec;
	
	//setters	

	void setHr (int h)
	{
		this.hr=h;
	}

	void setMin (int m)
	{
		this.min=m;
	}

	void setSec (int s)
	{
		this.sec=s;
	}

	//getters	

	int getHr ()
	{
		return this.hr;
	}

	int getMin ()
	{
		return this.min;
	}

	int getHr ()
	{
		return this.hr;
	}

	//constructors

	Time (){
		this.hr=10;
		this.min=45;
		this.sec=55;
	}

	Time (int h,int m,int s){
		this.hr=h;
		this.min=m;
		this.sec=s;
	}

	
	add()
