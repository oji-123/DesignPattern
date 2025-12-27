package com.example.demo.state;

public class LunchTimeState implements State {

	private static LunchTimeState singleton = new LunchTimeState();

	private LunchTimeState() {
	}

	public static LunchTimeState getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		if (hour < 9 || 17 <= hour) {
			context.chageState(NightState.getInstance());
		} else if ((9 <= hour && hour < 12) || (13 <= hour && hour < 17)) {
			context.chageState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("★非常事態！");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル(昼食時)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("昼食時の通話記録");
	}

	@Override
	public String toString() {
		return "{昼間}";
	}
}
