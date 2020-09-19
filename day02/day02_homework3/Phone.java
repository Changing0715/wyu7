/**
 * 
 */
package day02_homework3;

/**
 * @author: ³Â¿¥ÏÍ
 * @date: 2020Äê9ÔÂ19ÈÕ
 * @version:
 * @Description:
 */
public class Phone {
	private double screenSzie;
	private String brand;
	private String cpu;
	private String memory;
	public double getScreenSzie() {
		return screenSzie;
	}
	public void setScreenSzie(double d) {
		this.screenSzie = d;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	@Override
	public String toString() {
		return "Phone [screenSzie=" + screenSzie + ", brand=" + brand + ", cpu=" + cpu + ", memory=" + memory + "]";
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
}
