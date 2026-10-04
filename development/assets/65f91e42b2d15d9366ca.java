package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

public class BarcodeSystem {
	/*
	 * 바코드 입력시 해당하는 상품 정보 출력 프로그램
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 바코드(Key)는 상품(Product)과 대응하는 map 생성
		Map<Integer, Product> productMap = new HashMap<Integer, Product>();
		
		productMap.put(1111, new Product("콜라", 1500));
		productMap.put(2222, new Product("사이다", 1300));
		productMap.put(3333, new Product("몬스터", 1800));
		productMap.put(4444, new Product("핫식스", 2000));

		while (true) {
			System.out.print("바코드 입력: ");
			int inputBarcode = sc.nextInt();
			if (inputBarcode < 0) {
				System.out.println("프로그램 종료");
				break;
			} else {
				if (productMap.containsKey(inputBarcode)) {
					// 존재하는 상품
					System.out.println(productMap.get(inputBarcode));
				} else {
					System.out.println("등록되지 않은 상품입니다.");
				}
			}
		}
	}

}
