package com.example.demo.state;

public interface Context {
	public abstract void setClock(int hour);

	public abstract void chageState(State state);

	public abstract void callSecurityCenter(String msg);

	public abstract void recordLog(String msg);
}
