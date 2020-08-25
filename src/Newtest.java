
public class Newtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem 1
		
		System.out.println(true && false);
		
		System.out.println(true || false);
		
		System.out.println(false && false);
		
		System.out.println(true && (false || true));
		
		System.out.println(false || (true && false));
		
		System.out.println(false || 1 < 5);
		
		System.out.println(5 >= 4 && 1 > 3);
		
		System.out.println(10 < 4 || 1 > 4);
		
		System.out.println(12 >= 2 && 1 < 24);
		
		System.out.println("Hello" .charAt(0) == 'h');
		
		//Problem 2
		
		boolean isHotOutside = true;
		
		boolean isWeekday = false;
		
		boolean hasMoneyInPocket = true;
		
		//Problem 3
		
		double costofMilk = 8.50;
				
		int moneyinWallet = 20;
		
		int thirstLevel = 1-10;
		
		//Problem 4
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		
		boolean willGoSwimmming = isHotOutside || isWeekday;
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket || isWeekday;
		
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && 
				(moneyinWallet >= (2 * costofMilk));
		
			}
	}
