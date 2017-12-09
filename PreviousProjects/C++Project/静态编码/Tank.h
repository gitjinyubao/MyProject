class Tank
{
	public:
		Tank(int code);
		~Tank();
		void fire();
		static int getCount();
	private:
		int m_iCode;
		static int count;		
};

