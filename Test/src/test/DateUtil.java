package test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * @description 对日期的工具类
 * 
 * @author gongguanghui
 * 
 */
public class DateUtil {
	public static String getNowDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd 23:59:59");//定义日期格式

		Calendar nowdate=new GregorianCalendar();

		nowdate.add(Calendar.DATE, +15);

		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}
	

	/**
	 * 获取当前日期
	 */
	public static String getNowDate(String format) {
		Date nowDate=new Date();//获取当前日期
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		return dateFormat.format(nowDate);//返回获取的日期
	}

	/**

	 * 获取下一天的日期
	 * @throws ParseException 

	 */

	public static String getTomorrowDayDate(Date endTime) {

	/*SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd 00:00:00");//定义日期格式
	SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
//	Calendar nowdate=new GregorianCalendar();
	  Calendar cal=Calendar.getInstance(); 
      cal.setTime(dateFormat1.parse(endTime)); 

      cal.add(Calendar.DATE, +1);

	return dateFormat.format(cal.getTime());//返回获取的日期
*/	
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(endTime);
		nowdate.add(Calendar.DATE, +15);
		return dateFormat.format(nowdate.getTime());//返回获取的日期

	}
	/**
	 * 获取当前日期
	 */
	public static String getNowDate(String format,Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		return dateFormat.format(date);//返回获取的日期
	}
	/**
	 * 根据日期的字符串封装为Date对象
	 */
	public static Date getUtilDate(String datestr, String format) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);//定义日期格式
		Date date=null;
		try {
			date=dateFormat.parse(datestr);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			//e.printStackTrace();
		}
		return date;
	}
	/**
	 * 获取昨天的日期
	 */
	public static String getYesterDayDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.DATE, -1);
		return dateFormat.format(nowdate.getTime());//返回获取的日期
	}
	/**
	 * 获取3天前的日期
	 */
	public static String getBeforeDayDate(Date date,Integer day) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		Calendar cal=Calendar.getInstance(); 
	    cal.setTime(date); 
	    cal.add(Calendar.DATE, day);
		return dateFormat.format(cal.getTime());//返回获取的日期
	}
	/**
	 * 获取日期的上个月当天(yyyy-MM-dd)
	 */
	public static String getLastMonthDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 获取日期的下个月当天(yyyy-MM-dd)
	 */
	public static String getNextMonthDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH, 1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 获取日期的去年当天(yyyy-MM-dd)
	 * 
	 * @param date
	 * @return
	 */
	public static String getLastYearDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.YEAR, -1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 获取日期的明年当天(yyyy-MM-dd)
	 */
	public static String getNextYearDate(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.YEAR, 1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的明年当天(yyyy-MM-dd)
	 */
	public static String addYearDate(Date date,int add) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.YEAR, add);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的本周周一(yyyy-MM-dd)
	 */
	public static String getWeekMonday(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_WEEK,2);//获取周一

		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 获取日期的上周周一(yyyy-MM-dd)
	 */
	public static String getBeforeWeekMonday(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_WEEK,2);//获取周一
		nowdate.set(Calendar.DAY_OF_MONTH,nowdate.get(Calendar.DAY_OF_MONTH)-7);//获取上周

		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的上周周末(yyyy-MM-dd)
	 */
	public static String getBeforeWeekSunday(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.WEEK_OF_MONTH,1);
		nowdate.set(Calendar.DAY_OF_WEEK,1);
		nowdate.set(Calendar.DAY_OF_MONTH,nowdate.get(Calendar.DAY_OF_MONTH)-7);//获取上周
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 获取日期的本月月初(yyyy-MM-dd)
	 */
	public static String getMonthStartDay(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_MONTH,2);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的上月月初(yyyy-MM-dd)
	 */
	public static String getBeforeMonthStartDay(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_MONTH,2);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
		nowdate.set(Calendar.MONTH,nowdate.get(Calendar.MONTH)-1);
		return dateFormat.format(nowdate.getTime());
	}
	/**
	 * 获取日期的上月月末(yyyy-MM-dd)
	 */
	public static String getBeforeMonthEndDay(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.set(Calendar.DAY_OF_MONTH,1);
		nowdate.add(Calendar.DAY_OF_MONTH, -1);
//		nowdate.set(Calendar.MONTH,nowdate.get(Calendar.MONTH)-1);
		return dateFormat.format(nowdate.getTime());
	}

	/**
	 * 两天之间的间隔天数
	 */
	public static int dayDiff(Date date1, Date date2) {
		long diffMillseconds=date1.getTime()-date2.getTime();
		int diffDay=(int)(diffMillseconds/1000/60/60/24);
		return diffDay;
	}

	/**
	 * 两个时间之间的间隔时长
	 */
	public static int timeDiff(Date date1, Date date2) {
		long diffMillseconds=date1.getTime()-date2.getTime();
		int diffTime=(int)(diffMillseconds/1000/60);
		return diffTime;
	}
        /**
	 * 两个小时之间的间隔时长
	 */
	public static int hourDiff(Date date1, Date date2) {
		long diffMillseconds=date1.getTime()-date2.getTime();
		int diffTime=(int)(diffMillseconds/1000/60/60);
		return diffTime;
	}
	
	/**
	 * 获取日期处理后的日期
	 */
	public static Date getDealedDate(Date date, int addYear, int addMonth,
			int addDay, int addHour, int addMinute, int addSecond) {
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.add(Calendar.YEAR,addYear);
		nowdate.add(Calendar.MONTH,addMonth);
		nowdate.add(Calendar.DAY_OF_MONTH,addDay);
		nowdate.add(Calendar.HOUR_OF_DAY,addHour);
		nowdate.add(Calendar.MINUTE,addMinute);
		nowdate.add(Calendar.SECOND,addSecond);
		return nowdate.getTime();
	}
	/**
	 * 获取日期的第几周（周报固定值）
	 * (yyyy-MM-WW) WW指01-05
	 */
   	public static String getMonthWeek(Date date ){
		Calendar nowdate=new GregorianCalendar();
		nowdate.setTime(date);
		nowdate.set(Calendar.DAY_OF_WEEK,6);//设置周五
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-WW");//定义日期格式
   		return dateFormat.format(nowdate.getTime());
   	}
   	/**
	 * 获取日期的N个月后当天日期(yyyy-MM-dd)
	 */
	public static String getEndMonthDate(Date date,int N ) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		Calendar nowdate=new GregorianCalendar();
		nowdate.add(Calendar.MONTH, N);
		return dateFormat.format(nowdate.getTime());
	}
        
        /**
	 * 得到指定日期的前面指定天数的日期
	 * @param count
	 * @param time
	 * @return
	 */
	public static Date getBeforeDate(int count, Date time) {
		GregorianCalendar g = new GregorianCalendar();
		if(time == null) {
			time = new Date();
		}
		g.setTime(time);
		if(count == 0) {
			count = -15;
		} else {
			count = 0 +count;
		}
		//日期的DATE减去10  就是往前推10 天 同理 +10 就是往后推十天
        g.add(Calendar.DATE, count);
        return g.getTime();
	}
	/**
	 * 测试静态方法
	 */
	public static void main(String[] args) {
		Date now =new Date();
		/*Date d=getDealedDate(now,0,10,0,0,0,0);
		System.out.println(now);
		System.out.println(getDealedDate(now, 1, 1, 0, 0, 0, 0));
		System.out.println(getTomorrowDayDate(getDealedDate(now, 1, 1, 0, 0, 0, 0)));
		System.out.println(getNowDate("aaa",now));
		System.out.println(getNowDate(now));
		//System.out.print(timeDiff(d,now));
		*/
			
			
			
		// TODO 自动生成方法存根
		//SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
	
//		System.out.println(dateFormat.format(d));
//		System.out.println(getMonthStartDay(null));
                //System.out.println(StringUtil.formatDate(new Date(), "yyyyMMdd"));
		
		
		String nowDate = DateUtil.getNowDate(new Date());
	/*	String str1 = nowDate.substring(0,4);
		Integer in1 = Integer.parseInt(str1);
		System.out.println(str1);
		if(2015>in1+1){
			System.out.println("创建年比当前年大一年以上！");
		}else{
			System.out.println("正确！");
		
		*/
		getBeforeDayDate(now, -3);
		System.out.println(getBeforeDayDate(now, -6));
                Date d1 = DateFormatUtil.stringToDatetime("2017-03-10 12:15:30");
                System.out.println(hourDiff(new Date(),d1));
                int diff = hourDiff(new Date(),d1);
                Integer level = null;
                if(diff<15){
                   System.out.println("111");
                   level = 1;
                }else if(diff>15&&diff<=60){
                    System.out.println("222");
                    level = 2;
                }else{
                    level = 3;
                }
                System.out.println(level);
                System.out.println(getBeforeDate(15,new Date()));
		
	}

}
